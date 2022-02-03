package co.kishore.day5.Strings;

import java.util.Scanner;

public class StringAlternativePrint {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string");
		String a=sc.next();
		System.out.println("Enter the next string");
		String b=sc.next();
		StringBuffer s1= new StringBuffer();
		int i=0;int j=0;
		try {
			while(i<a.length()||j<b.length())
		{
			
				s1.append(a.charAt(i)).append(b.charAt(j));
			i++;
			j++;
			
		}
				
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Exception because of uneven size");
		}
		System.out.println(s1);
	}

}
