package com.demo.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	String name;
	String email;
	Address address;
	
	@Autowired
	public Employee(Address add){
		System.out.println("inside the constructor");
		add.setLocation("india");
		add.setCity("mumbai");
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	public void EmployeeAddress() {
	//	address.setLocation("kukatpally");
	//	address.setCity("Hyd");
		
		System.out.println(address.getLocation());
		System.out.println(address.getCity());
	}

}
