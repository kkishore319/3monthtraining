package co.kishore;

public class LargestamongTHree {
	public static void main(String[] args) {
		
		int a=122;
		int b=22;
		int c=31;
		
		if (a>b) {
			if (a>c) {
				System.out.println("Largest number is a");
			}
			else
				System.out.println("largest number is c");
		}
		else {
			if (b>c) {
				System.out.println("Largest number is b");
			}
			else
				System.out.println("largest number is c");
			
		}
		
	}
	

}
