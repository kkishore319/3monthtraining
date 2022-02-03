package co.kishore.day5.Strings;

import java.util.Scanner;

public class WithoutFirstnLastPrint {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the any string");
		String str=sc.next();
		System.out.println(str.substring(1, str.length()-1));
	}

}
