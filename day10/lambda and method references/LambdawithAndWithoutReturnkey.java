package co.kishore.day10.lambdaANdMethodReferences;


interface Add{
	
	int add(int a , int b);
	
}

public class LambdawithAndWithoutReturnkey {
	public static void main(String[] args) {
		
		Add ad=(a,b)->(a+b); //without return
		
		System.out.println(ad.add(5, 5));
		
		Add addd=(a,b)->{
			return(a+b); //with return
		
		};
		
		System.out.println(addd.add(5, 51));
		
		
	}
	
	

}
