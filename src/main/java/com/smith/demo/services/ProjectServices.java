package com.smith.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smith.demo.dao.ProjectRepository;
import com.smith.demo.entitis.Project;

@Service
public class ProjectServices {
	
	@Autowired
	private ProjectRepository proRepo;
	
	public void createProject(Project project) {
		Optional<Project> pro =  proRepo.findById(project.getProjectId());
		if(!pro.isPresent()) {
			proRepo.save(project);
		}
	
	}
	
	public Project findProjct(Long id) {
		Optional<Project> pro =  proRepo.findById(id);
		if(!pro.isPresent()) {
			return null;
		}else {
			return pro.get();
		}
		
	}
	
	public List<Project> getAllProjects(){
		List<Project> projects = proRepo.findAll();
		return projects;
	}
	
	public void deleteProject(Long id) {
		Optional<Project> pro =  proRepo.findById(id);
		if(pro.isPresent()) {
			proRepo.delete(pro.get());
		}
	}
	
}
