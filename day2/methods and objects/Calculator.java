package co.kishore.day2;

class power{
	double powerInt (int num1, int num2)
	{
		if (num1!=0)
			{
			double val=1;
			for(int i=1; i<=num2;i++) {
				val*=num1;
			}
			
		return val;}
			
		}
	double powerDouble(double num1, int num2)
	{
		if (num1!=0)
		{
		double val=1;
		for(double i=1; i<=num2;i++) {
			val=val*num1;
		}
		}
		return val;}

}

public class Calculator {
	public static void main(String[] args) {
		power c=new power();
		double res1= c.powerInt(1,2);
	}
	
	

}
