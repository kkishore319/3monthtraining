package co.kishore;

import java.util.Scanner;

public class ObjAscii {
	int value(char ch)
	{
		int val=ch;
		return val;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a char");
		char ch=sc.next().charAt(0);
		ObjAscii a1= new ObjAscii();
		int res= a1.value(ch);
		System.out.println("the ascii value is "+res);
		
	}
	
}

