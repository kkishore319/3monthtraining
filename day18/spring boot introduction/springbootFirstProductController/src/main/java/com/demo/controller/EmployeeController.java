package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.pojo.Employee;

@RestController
public class EmployeeController {
	
	@GetMapping(value="/show")
	String show() {
		return "this is employee controller"
				+ "\n enter /getemployeedetails";
		
	}
	
	@GetMapping(value="/getemployeedetails")
	Employee getEmployeedetails(Employee emp) {
		
		emp.setId(1);
		emp.setName("kawasaki");
		emp.setEmail("kawasaki@gmail.com");
		emp.setSalary("17500");
		
		return emp;
		
	}
	

}
