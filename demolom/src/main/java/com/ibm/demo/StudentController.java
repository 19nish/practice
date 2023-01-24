package com.ibm.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/student-details")
	public Student getStudent() {
		return new Student(182207, "Nishant", "Chaudhari");
	}
	
	@GetMapping("/student-list")
	public List<Student> getStudents(){
		List<Student>students = new ArrayList<>();
		students.add(new Student(1822201, "Rohit", "Aage"));
		students.add(new Student(1822204, "Kunal", "Bhavsar"));
		students.add(new Student(1822211, "Mohit", "Gaywar"));
		students.add(new Student(1822219, "Jayesh", "Kapadne"));
		students.add(new Student(1822229, "Sourabh", "Vevhare"));
		return students;
		
	}
	
	// http://localhost:8080/student/id/firstName/lastName
	@GetMapping("student/{id}/{firstName}/{lastName}")
	public Student studenPathVarriable(@PathVariable("id") long id,
			@PathVariable("firstName") String firstName,@PathVariable("lastName") String lastName) {
		return new Student(id,firstName, lastName);
	}
	
	// build rest Api to handle query parameter 
	//http://localhost:8080/student?id=1822207&firstName=Nishant
	@GetMapping("/student/query")
	public Student studentQueryParam(@RequestParam(name= "id") long id,
			@RequestParam(name= "firstName") String firstName,
			@RequestParam(name="lastName")	String lastName) {
		return new Student (id, firstName,lastName); 
	}
	
	

}
