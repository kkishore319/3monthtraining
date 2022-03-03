package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.pojo.Message;

public class MainClass {
	public static void main(String[] args) {
		
		ApplicationContext ac= new ClassPathXmlApplicationContext("bean.xml");
		Message m1= (Message) ac.getBean("mymessage");
		System.out.println("this is object of the m1 "+m1);
		m1.show();
		
		
		Message m2= (Message) ac.getBean("mymessage");
		System.out.println(m2.getMessage());
		System.out.println("this is a object of m2 "+m2);
	}

}
