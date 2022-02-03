package co.kishore.day5.Strings;

import java.util.Scanner;


public class TwostringsAndoneNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the any string");
		String x=sc.next();
		System.out.println("Enter next string");
		String o=sc.next();
		System.out.println("now a number");
		int num=sc.nextInt();
	
		StringBuffer s1=new StringBuffer();
		for(int i=0;i<num-1;i++)		
			s1.append(x).append(o);
		s1.append(x);
		System.out.println(s1);
		
	}

}
