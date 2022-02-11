package co.kishore.day10.lambdaANdMethodReferences;

interface game{
	boolean b=true;
	public boolean isODD(int a); 

}


public class IsODD {
	
	public static void main(String[] args) {
		
		
		game g=(a)->{
			if(a%2!=0) {
				return true;
			}
			else {
				return false;
			}	
		};
		boolean b1=g.isODD(555);
		if (b1)
			System.out.println(" is a odd");
		else
			System.out.println(" is not a odd");
		 
	}

}
