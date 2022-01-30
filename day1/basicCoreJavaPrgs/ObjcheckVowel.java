package co.kishore;

import java.util.Scanner;  
public class ObjcheckVowel {
	void check(char ch)
	{
		if (ch == 'a'|| ch == 'e'||ch == 'o'|| ch == 'o'||ch == 'u'){
			System.out.println("the given alphabet is a vowel");
		}
		else {
			System.out.println("the given alphabet is a consonant");
		}
	}
	public static void main(String[] args) {
		
	
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a alphabet of lower case");
		char ch=sc.next().charAt(0);
		ObjcheckVowel o1= new ObjcheckVowel();
		o1.check(ch);
	}

}
