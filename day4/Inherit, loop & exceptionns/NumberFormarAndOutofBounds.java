package co.kishore.day4.exception;

import java.util.Scanner;

public class NumberFormarAndOutofBounds {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter the elements");
		try {
			for (int i=0;i<n;i++)
			{
				
				array[i]=sc.nextInt();	
			}
		}
			catch (NumberFormatException e) {
				System.out.println("Num format Exception: it doesn't match the size of the array to no.of elements");
				}
			System.out.println("Enter the index of the array which you want to access");
			try {
				int x=sc.nextInt();
				System.out.println(array[x]);
		}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Out of bound Exception : Entered index is out of bound");
			}
	}

}


