package co.kishore.day5.Strings;

import java.util.Scanner;

public class PrintingThefirstTwochars {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the any string");
		String str=sc.next();
		String newstr=str.substring(0, 2);
		for (int i=0;i<str.length();i++)
		{
			System.out.print(newstr);
		}

		
	}

}
