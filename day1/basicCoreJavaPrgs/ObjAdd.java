package co.kishore;

import java.util.Scanner;

class add
{
	int Addnum()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number");
	int a=sc.nextInt();
	System.out.println("enter the next number ");
	int b=sc.nextInt();
	int result= a+b;
	return result;

	}
	
}

public class ObjAdd {
	public static void main(String[] args) {
		add a1=new add();
		int result= a1.Addnum();
		System.out.println("sum of two numbers "+result);
	
	}

}
