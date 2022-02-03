package co.kishore.day5.Strings;

import java.util.Scanner;

public class StringRemoveX {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the any string");
		String str=sc.next();
		if ((str.charAt(0)==str.charAt((str.length())-1))&&(str.charAt(0)=='x'))
		{
			System.out.println(str.substring(1, str.length()-1));
		}
		else if(str.charAt(0)=='x')
		{
			System.out.println(str.substring(1));
		}
		else if ((str.charAt(str.length()-1)=='x'))
		{
			System.out.println(str.substring(0, str.length()-1));
		}
		else 
		{
			System.out.println(str);
		}
				


	}

}
