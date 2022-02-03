package co.kishore.day5.Strings;

import java.util.Scanner;

class str {
	String starremov(String str) {
		int len = str.length();
		String finalString = "";

		for(int i = 0;i<len;i++)
		{
			if (i == 0 && str.charAt(i) != '*')
				finalString += str.charAt(i);
	  
			if (i > 0 && str.charAt(i) != '*' && str.charAt(i-1) != '*')
				finalString += str.charAt(i);
	      
			if (i > 0 && str.charAt(i) == '*' && str.charAt(i-1) != '*')
				finalString = finalString.substring(0,finalString.length()-1);
	      
		}
		return finalString;
	}
}

public class StarRemove  {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the any string");
		String x=sc.next();
		str s=new str();
		
		System.out.println(s.starremov(x));
	}

	
}
