package co.kishore.day4.loops;

import java.util.Scanner;

public class Oddoreven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if (n%2==0)
		{
			System.out.println(n+" is a even number");
		}
		else if (n%2!=0)
		{
			System.out.println(n+" is a odd number");
		}
		
	}

}
