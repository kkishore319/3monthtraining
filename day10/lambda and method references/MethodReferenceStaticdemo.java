package co.kishore.day10.lambdaANdMethodReferences;

import java.util.function.BiFunction;

class Addable{
	
	public static int Add (int a, int b) {
		
		return a+b;
	}
}

public class MethodReferenceStaticdemo {
	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> a=Addable::Add;
		
		int result = a.apply(46, 4);
		
		System.out.println(result);
		
		
	}

}
