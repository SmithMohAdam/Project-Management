package com.smith.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ProjectManagementApplication {
	
	

	public static void main(String[] args) {
		SpringApplication.run(ProjectManagementApplication.class, args);
	}
	
//	@Bean
//	CommandLineRunner runner(){
//		return  args -> {
//			
//			Employee emp1 = new Employee("Mohamed" , "Adam" , "a@gmail.com");
//			Employee emp2 = new Employee("Rana" , "Mohamed" , "r@gmail.com");
//			Employee emp3 = new Employee("Osman" , "Ahmed" , "o@gmail.com");
//			Employee emp4 = new Employee("Rahaf" , "Mohamed" , "ra@gmail.com");
//			
//			Project pro1 = new Project("Management App" , "" ,"Management");
//			Project pro2 = new Project("Abanos App" , "" ,"Abanos");
//			Project pro3 = new Project("Infinety App" , "" ,"Infinity");
//			
//			emp1.setProjects(Arrays.asList(pro1 , pro2));
//			emp2.setProjects(Arrays.asList(pro1));
//			emp3.setProjects(Arrays.asList(pro1 , pro2 , pro3));
//			emp4.setProjects(Arrays.asList(pro3 , pro2));
//			
//			pro1.setEmployees(Arrays.asList(emp1 ,emp2 , emp3 , emp4));
//			pro2.setEmployees(Arrays.asList(emp1 ,emp2 , emp3));
//			pro3.setEmployees(Arrays.asList(emp3 , emp4));
//			
//			empRepo.save(emp1);
//			empRepo.save(emp2);
//			empRepo.save(emp3);
//			empRepo.save(emp4);
//			
//			proRepo.save(pro1);
//			proRepo.save(pro2);
//			proRepo.save(pro3);
//			
//		};
//	}

}
