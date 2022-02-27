package com.smith.demo.dao;


/*This class is for integration test*/

//@ContextConfiguration(classes=ProjectManagementApplication.class)  //it's to load all the class and dependances in the code
//and the in side prameter is to determaine the intery point of the app
//@RunWith(SpringRunner.class) // the test runner it's needed for all integration tests
//@DataJpaTest // it's used for the test related to the data (the repositorys) Annotation for a JPA test that focuses only on JPA components. 
//@SqlGroup({@Sql(executionPhase = ExecutionPhase.BEFORE_TEST_METHOD , scripts= {"classpath:schema.sql" , "classpath:data.sql"}),
//@Sql(executionPhase = ExecutionPhase.AFTER_TEST_METHOD , scripts= "classpath:drop.sql")}) //hear we identify the sql files that's we want it to be executed through the test
//and the inner prammeter means that the sql will be executed befor the method
public class ProjectRepositoryIntegrationTest {
	
//	@Autowired
//	ProjectRepository proRepo;
//	
//	@Test
//	public void ifNewProjectSaved_ThenSucsess() {
//		
//		Project newProject = new Project("new project" , "COMPLET","it's for test");
//		proRepo.save(newProject);
//		
//	}

}
