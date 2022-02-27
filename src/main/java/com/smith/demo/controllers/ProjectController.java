package com.smith.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.smith.demo.entitis.Employee;
import com.smith.demo.entitis.Project;
import com.smith.demo.services.EmployeeServices;
import com.smith.demo.services.ProjectServices;

@Controller
@RequestMapping("/projects")
public class ProjectController {
	
	
	@Autowired
	private ProjectServices proSer;
	
	@Autowired
	private EmployeeServices emplSer;
	
	@GetMapping
	public String displayProjects(Model model){
		List<Project> projects = proSer.getAllProjects();
		model.addAttribute("projects",projects);
		return "projects/list-projects";
	}
	
	@RequestMapping("/new")
	public String displayProjectForm(Model model) {
		
		Project aProject = new Project();
		List<Employee> employees = emplSer.getAllEmployees();
		model.addAttribute("project" , aProject);
		model.addAttribute("allEmployees" , employees);
		
		return "projects/new-project";
	}
	
	@RequestMapping(value="/save" , method = RequestMethod.POST)
	public String createProject(Project project , Model model) {
		proSer.createProject(project);
		return "redirect:/projects/new";
	}

}
