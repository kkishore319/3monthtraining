package co.kishore.day4.loops;

import java.util.Scanner;

public class PosOrNev {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Integer");
		int n=sc.nextInt();
		if (n==0)
		{
			System.out.println(n+" is zero");
		}
		else if (n>0)
		{
			System.out.println(n+" is positive integer");
		}
		else
		{
			System.out.println(n+" is a negative integer");
		}
	}

}
