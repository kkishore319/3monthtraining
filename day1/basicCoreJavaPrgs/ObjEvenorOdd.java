package co.kishore;

import java.util.Scanner;

class even{
	String evenOdd()
	{
		String x;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int a= sc.nextInt();
		if (a%2==0) {
			x="even";
		}
		else {
			x="odd";
		}
		return x;
		
	}
}


public class ObjEvenorOdd {
	public static void main(String[] args) {
		even e1= new even();
		String res =e1.evenOdd();
		System.out.println("The given number is "+res);
		
	}
	

	
}
