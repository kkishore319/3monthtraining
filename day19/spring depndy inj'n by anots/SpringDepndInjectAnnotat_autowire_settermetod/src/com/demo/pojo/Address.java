package com.demo.pojo;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	int id;
	String location;
	String city;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void showAddress() {
		System.out.println("the address is "+location);
		System.out.println("in city "+city);
		
		
	}
	
	
}
