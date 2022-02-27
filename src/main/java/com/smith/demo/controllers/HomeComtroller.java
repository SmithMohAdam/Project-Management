package com.smith.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smith.demo.dao.EmployeeRepository;
import com.smith.demo.dao.ProjectRepository;
import com.smith.demo.entitis.Employee;
import com.smith.demo.entitis.Project;

@Controller
public class HomeComtroller {

	@Autowired
	private ProjectRepository proRebo;
	
	@Autowired
	private EmployeeRepository empRebo;
	
	@RequestMapping("/")
	public String viewHome(Model model) {
		List<Project> projects = proRebo.findAll();
		List<Employee> employees = empRebo.findAll( );
		model.addAttribute("projects",projects);
		model.addAttribute("employees",employees);
		return "main/home";
	}
	
}
