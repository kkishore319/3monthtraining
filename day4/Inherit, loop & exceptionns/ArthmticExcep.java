package co.kishore.day4.exception;

public class ArthmticExcep {
	public static void main(String[] args) {
		
		for(int i=-2;i<3;i++)
		{
			try {
			System.out.println(10/i);
			
		}
			catch(ArithmeticException e) {
				System.out.println("exception : 10 is divided by 0");
			}
			
		}
	}

}
