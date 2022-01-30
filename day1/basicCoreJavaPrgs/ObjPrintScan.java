package co.kishore;

import java.util.Scanner;

public class ObjPrintScan {
	int scan()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int a=sc.nextInt();
		return a;
		
	}
	public static void main(String[] args) {
		ObjPrintScan o1=new ObjPrintScan();
		int res=o1.scan();
		System.out.println("Entered number is "+res);
	}

}
