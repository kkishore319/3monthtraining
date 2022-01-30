package co.kishore;

import java.util.Scanner;

class Multiply{
	float multi()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		float c= a*b;
		return c;
	}
}

public class ObjMultiplyFloat {
	public static void main(String[] args) {
		
		Multiply m1=new Multiply();
		float res= m1.multi();
		System.out.println("The product is "+res);

	}

}
