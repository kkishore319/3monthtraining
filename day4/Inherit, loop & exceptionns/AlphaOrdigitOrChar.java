package co.kishore.day4.loops;

import java.util.Scanner;

public class AlphaOrdigitOrChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		int num=ch;
		if ((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z'))
		{
			System.out.println("Alphabet");
		}
		else if(num>=48&&num<=57)
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special char");
		}
	}

}
