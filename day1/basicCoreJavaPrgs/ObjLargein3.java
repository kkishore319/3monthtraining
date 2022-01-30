package co.kishore;

import java.util.Scanner;

class largest {
	int inThree()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if (a>b) {
			if (a>c) {
				return a;
			}
			else {
				return c;
			}
		}
		else {
			if (b>c) {
				return b;
			}
			else {
				return c;
			}
		}
	}
}

public class ObjLargein3 {
	public static void main(String[] args) {
		largest l1= new largest();
		int res=l1.inThree();
		System.out.println("The largest number among them is "+res);
	}

}
