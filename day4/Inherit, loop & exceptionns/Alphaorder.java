package co.kishore.day4.loops;

import java.util.Scanner;


public class Alphaorder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first alphabet");
		char a1= sc.next().charAt(0);
		System.out.println("Enter second alphabet");
		char a2=sc.next().charAt(0);
		int val1=a1;
		int val2=a2;
		if (val1<val2)
		{
			System.out.println(a1+","+a2);
		}
		else
		{
			System.out.println(a2+","+a1);
		}
		
	}
}
