package com.smith.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.smith.demo.entitis.Employee;
import com.smith.demo.services.EmployeeServices;



@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	
	@Autowired
	private EmployeeServices employeesSer;
	
	@GetMapping
	public String displayEmployees(Model model){
		List<Employee> employees = employeesSer.getAllEmployees();
		model.addAttribute("employees",employees);
		return "employees/list-employees";
	}
	
	@RequestMapping("/new")
	public String displayEmployeeForm(Model model) {
		Employee aEmployee=new Employee();
		model.addAttribute("employee" , aEmployee);
		return "employees/new-employee";
	}
	
	@RequestMapping(value="/save" , method = RequestMethod.POST)
	public String createEmployee(Employee employee,Model model) {
		
		employeesSer.createEmployee(employee);
		return "redirect:/employees/new";
		
	}


}
