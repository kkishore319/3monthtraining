package co.kishore.day4.loops;

import java.util.Scanner;

public class Casechange {
	public static void main(String[] args) {  
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter word");
		
		String str=sc.nextLine();
		StringBuffer newstr=new StringBuffer(str);
		for (int i=0;i<str.length();i++) {
			if (Character.isLowerCase(str.charAt(i))) 
			{
				newstr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			}
			else if(Character.isUpperCase(str.charAt(i)))
			{
				newstr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
	
		}
		System.out.println(newstr);
    	
    }
}
    
            
