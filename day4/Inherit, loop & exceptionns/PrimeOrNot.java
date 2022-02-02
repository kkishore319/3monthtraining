package co.kishore.day4.loops;

public class PrimeOrNot {
	public static void main(String[] args) {
		int a=73;
		boolean b=true;
		for (int i=2, limit= (a/2); i<limit; i++)
		{
			if (a%i==0)
			{
				b=false;
			}
		}
		if (b) {
			System.out.println(a+" is a prime num");
		}
		else {
			System.out.println(a+" is not a prime num");
		}
	}

}
