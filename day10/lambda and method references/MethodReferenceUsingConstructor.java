package co.kishore.day10.lambdaANdMethodReferences;

interface Messagable{
	void getMessage(String msg);
	
}

class Message{
	//constructor
	Message(String msg){
		
		System.out.println("From constructor ");
		System.out.println("==========="+msg);
		
	}
}

public class MethodReferenceUsingConstructor {
	public static void main(String[] args) {
		
		Messagable m=Message::new;
		
		m.getMessage("how to you do?");
		
		
	}
	

}
