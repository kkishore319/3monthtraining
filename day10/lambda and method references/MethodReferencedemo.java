package co.kishore.day10.lambdaANdMethodReferences;

interface Messagable1{
	
	void getMessage(String msg);
}
class Message1{
	void show (String msge) {
		
		System.out.println("From method");
		System.out.println("======"+msge);
	}
}



public class MethodReferencedemo {
	public static void main(String[] args) {
		
		Message1 m=new Message1();
		
		Messagable1 m2= m::show;
		
		m2.getMessage("hahhaah");
	}

}
