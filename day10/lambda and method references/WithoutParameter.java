package co.kishore.day10.lambdaANdMethodReferences;

interface Sayable{
	
	public String say();
}
public class WithoutParameter {
	public static void main(String[] args) {
		
		Sayable s=()->{
			return "hai mowa";
		};
		System.out.println(s.say());
	}

}
