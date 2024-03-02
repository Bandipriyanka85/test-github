package com.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/test")
public class TestController {

	@Autowired
	TestService testService;
	@GetMapping("/details/{ids}/{name}")
	public Student getStudentDetailsById(@PathVariable String ids,@PathVariable String name) {
		System.out.println("id value ::"+ids+ "::name ::"+name);
		Student student = new Student();
		student.setName("deva");
		student.setId("7");
		student.setGmail("deva@gmail.com");
		student.setAddress("anantapur");
		return student;
	}

	@GetMapping("/details")
	public Student getStudentDetails(@RequestParam String id) {
		//System.out.println("id value ::"+ids+ "::name ::"+name);
		System.out.println("id value ::"+id);
		Student student = new Student();
		student.setName("deva");
		student.setId("7");
		student.setGmail("deva@gmail.com");
		student.setAddress("anantapur");
		return student;
	}

	@GetMapping("/devadetails")
	public Student getDevaDetailsById() {
		Student student = new Student();
		student.setName("deva");
		student.setId("7");
		student.setGmail("deva@gmail.com");
		student.setAddress("anantapur");
		return student;
	}

	@PostMapping("/printdeatils")
	public void printStudentDetails(@RequestBody Student student){

		log.info("student details ::"+student.toString());
	}

	@PostMapping("/saveDetails")
	public String saveDetails(@RequestBody MailDetails mailDetails){
		log.info("MailDetails ::"+mailDetails.toString());
		String message = testService.saveMailDetails(mailDetails);
		return message;

	}

	@PostMapping("/studentFamliyDetails")
	public void studentFamliyDetails(@RequestBody StudentDetails studentDetails){
		log.info("Student Mother details ::"+studentDetails.getStudentMotherDetails());

		log.info("studentDetails ::"+studentDetails.toString());

	}


}
