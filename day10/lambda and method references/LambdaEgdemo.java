package co.kishore.day10.lambdaANdMethodReferences;


@FunctionalInterface

interface Drawables{
	
	public void  draw();
	
}


public class LambdaEgdemo {
		
	public static void main(String ar[]) {
		
		int width=10;
		
		///functionalStyle
		
		Drawables dJ=()->{
			
			System.out.println("width "+width);
		};
		dJ.draw();
		
		


	}
}
