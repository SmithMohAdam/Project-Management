package com.smith.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.smith.demo.dao.ProjectRepository;
import com.smith.demo.entitis.Project;

@SpringBootTest
@RunWith(SpringRunner.class)
class ProjectManagementApplicationTests {
	
	@Autowired
	ProjectRepository proRepo;

	@Test
	void contextLoads() {
		
		System.out.println("From Test Unit");
	}
	
	
	
	@Test
	public void ifNewProjectSaved_ThenSucsess() {
		
		Project newProject = new Project("new project" , "COMPLET","it's for test");
		System.out.println("From Test Unit insertion");
		proRepo.save(newProject);
		
	}

}
