package co.kishore.day5.Strings;

import java.util.Scanner;
//class PrintEvenString{
//	String Halfprint(String str1)
//	{
//		if((str1.length())%2==0)
//		{
//			return str1.substring(str1.length()/2);
//**		else 		{
//		return null;
///	}
///}
//	

//}

public class StringReturningTHeString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the any string");
		String str=sc.next();
		
		if(str.length()%2==0)
			{
				System.out.println(str.substring(0, str.length()/2));
			}
		else 		
			{
				System.out.println("null");
			}
		
		//PrintEvenString p1=new PrintEvenString();
		//p1.Halfprint(str);
		//System.out.println(p1);
	}

}
