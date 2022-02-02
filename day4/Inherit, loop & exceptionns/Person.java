package co.kishore.day4;

import java.util.Scanner;

public class Person {
	
	static void name()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String str=sc.nextLine();
		System.out.println(str);

	}
	
	
	public static void main(String[] args) {
		Person p=null;
		p.name();

	}

}
