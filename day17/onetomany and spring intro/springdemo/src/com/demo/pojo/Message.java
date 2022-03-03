package com.demo.pojo;


public class Message {
	
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void show() {
		System.out.println("this is called without constructor for object creation");
	}

}
