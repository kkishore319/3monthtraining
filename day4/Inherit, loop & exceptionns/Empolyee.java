package co.kishore.day4;

import java.util.Scanner;

public class Empolyee extends Person {
	static double salary()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your salary");
		double sal=sc.nextDouble();
		
		return sal;
	}
	static int yearOfjoin()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter yr of join");
		int yr=sc.nextInt();
		return yr ;
	}
	static void nationalInsuranceNum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the national Insurance no.");
		String nin=sc.nextLine();
		System.out.println(nin);
	}
	
	
	
	public static void main(String[] args) {
		
	}

}
