package com.smith.demo.services;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.smith.demo.dao.EmployeeRepository;
import com.smith.demo.entitis.Employee;

@Service
public class EmployeeServices {
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	public void createEmployee(Employee employee) {
		Optional<Employee> emp = employeeRepo.findById(employee.getEmployeeId());
		if(!emp.isPresent()) {
			employeeRepo.save(employee);
		}
		
	}
	
	public Employee findEmployee(Long id) {
		Optional<Employee> emp = employeeRepo.findById(id);
		if(emp.isPresent()) {
			return emp.get();
		}else {
			return (Employee) nullValue();
		}
	}
	public List<Employee> getAllEmployees( ){
		List<Employee> employees = employeeRepo.findAll();
		return employees;
	}
	
	
	public void deleteEmployee(Long id) {
		Optional<Employee> emp = employeeRepo.findById(id);
		if(emp.isPresent()) {
			employeeRepo.delete(emp.get());
		}
	}
	
	
	
	
}
