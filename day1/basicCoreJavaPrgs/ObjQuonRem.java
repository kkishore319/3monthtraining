package co.kishore;

import java.util.Scanner;

class Div{
	
	int Quo(int a,int b) 
	{
		int res = a/b;
		return res;
	}
	int Rem(int a,int b)
	{
		int res=a%b;
		return res;
	}
}

public class ObjQuonRem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter dividend");
		int a = sc.nextInt();
		System.out.println("enter the divisor");
		int b = sc.nextInt();
		Div d1= new Div();
		int q=d1.Quo(a, b);
		int r=d1.Rem(a, b);
		System.out.println(" The Quotient is "+q+" and Remainder is "+r);
		
	}

}
