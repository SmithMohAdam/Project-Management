package com.smith.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.smith.demo.entitis.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long>{
	
	@Override
	public List<Project> findAll();

}
