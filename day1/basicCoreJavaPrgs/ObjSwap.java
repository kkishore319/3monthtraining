package co.kishore;

import java.util.Scanner;

class SWap {
	void swap(int a,int b)
	{
		
		int temp ;
		temp=a;
		a=b;
		b=temp;
		System.out.println("the swaped numbers are "+a+" and "+b);
	}
}

public class ObjSwap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		SWap s1=new SWap();
		s1.swap(a,b);
		
	}

}
