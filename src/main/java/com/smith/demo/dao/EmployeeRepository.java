package com.smith.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.smith.demo.entitis.Employee;


public interface EmployeeRepository extends CrudRepository<Employee, Long>{
	@Override
	public List<Employee> findAll();
}
