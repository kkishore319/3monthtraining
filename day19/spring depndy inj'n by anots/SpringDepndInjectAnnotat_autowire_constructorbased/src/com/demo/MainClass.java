package com.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.config.AppConfig;
import com.demo.pojo.Address;
import com.demo.pojo.Employee;

public class MainClass {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
		Employee e=context.getBean(Employee.class);
		Address a=new Address();
		a.setLocation("lil");
		a.setCity("hdy");	
		e.setAddress(a);
		e.EmployeeAddress();
		//a.showAddress();
	}

}
