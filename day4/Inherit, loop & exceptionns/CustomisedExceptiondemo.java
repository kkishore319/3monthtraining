package co.kishore.day4.exception;

//Exception this my super class
class MyException extends Exception {

	MyException(String messge) {

		super(messge);// calling the super class constructor of Exception

	}

}

public class CustomisedExceptiondemo {

	public static void main(String ar[]) {
		try {
			throw new MyException(" this is my own exceptions");
			
			
		} catch (MyException e) {  // this is my own exceptions
			System.out.println("caught");
		}

	}

}