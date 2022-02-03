package co.kishore.day5.exceptions;



import java.io.*;
//rule 1
class Parent {

	// defining the method
	void msg() {
		System.out.println("parent method");
	}
}

public  class OverridingRule1 extends Parent {

	// overriding the method in child class	// gives compile time error
	/*
	 * void msg() throws IOException { System.out.println("TestExceptionChild");
	 * //overriden method does not throw exceptuion }
	 */
	 
	 void msg() throws ArithmeticException {
		System.out.println("TestExceptionChild");   //overriden method does  not throw exception of checked but we can use un checked exception
	}
	 
	 
	public static void main(String args[]) {
		Parent p = new OverridingRule1();
		p.msg();
	}
}
