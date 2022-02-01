package co.kishore.day2;

import java.util.Scanner;

public class Numerology1 {
	
	long sum(long num) 
	{
		long add=0;
		while(num>0) {
			add=add+num%10;
			num=num/10;
		}
		return add;
	}
	long numernum(long q)
	{
		long add = 0;
		while(q>0)
		{
			add=add+q%10;
			
			q=q/10;
		}
		if(add==10)
			return 1;
		return add;

	}
	long odd(long num)
	{
		long add,count=0;
		while(num>0) {
			add=num%10;
			if ((add%2)!=0) {
				count++;
			}
			num=num/10;
		}
		return count;
	}
	long even(long num)
	{
		long add,count=0;
		while(num>0) {
			add=num%10;
			if ((add%2)==0) {
				count++;
			}
			num=num/10;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		long num=sc.nextLong();
		Numerology1 n=new Numerology1();
		long a =n.sum(num);
		System.out.println("sum of numbers is "+a);
		long no= n.numernum(a);
		System.out.println("The numerology number is "+no);
		long oddones=n.odd(num);
		System.out.println("The no.of odd numbers are "+oddones);
		long evenones=n.even(num);
		System.out.println("The no.of even numbers are "+evenones);
		
	}
	
}
