package co.kishore.day4.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringtoINT {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		
		try {
			int i =sc.nextInt();
			System.out.println("Entered number is "+i);
		}
		catch(InputMismatchException e) {
			System.out.println("Other than number something is entered");
		}
		 
		
	}

}
