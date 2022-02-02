package co.kishore.day4.loops;

import java.util.Scanner;

public class ColorCode {
	public static void main(String[] args) {
		System.out.println("Enter the color code"); 
		System.out.println("R or B or G or O or Y or W");
		Scanner sc=new Scanner(System.in);
		char choice= sc.next().charAt(0); 
		switch(choice) {
		case 'R':
			System.out.println("Red");
			break;
		case 'B':
			System.out.println("Blue");
			break;
		case 'G':
			System.out.println("Green");
			break;
		case 'O':
			System.out.println("Orange");
			break;
		case 'Y':
			System.out.println("Yellow");
			break;
		case 'W':
			System.out.println("White");
			break;
		default:
			System.out.println("Invalid code");
			break;
		}
			
				
		
		
	}

}
