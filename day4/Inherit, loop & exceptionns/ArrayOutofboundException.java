
package co.kishore.day4.exception;

import java.util.Scanner;

public class ArrayOutofboundException{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no.of elements required in array");
		int n= sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter the elements in array");
		for (int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		
		System.out.println("Enter the index of the array element you want to access ");
		//System.out.println(array[4]);
		try {
			int x=sc.nextInt();
			System.out.println(array[x]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception: Entered index is larger than the array");
		}
		
	}

}
