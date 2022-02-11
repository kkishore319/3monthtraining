package co.kishore.day10.lambdaANdMethodReferences;

import java.util.ArrayList;

public class Loopdemo {
	public static void main(String[] args) {
		
		
	ArrayList<String> a=new ArrayList<String>();
	a.add("kota");
	a.add( "Kishore");
	a.add( "Kumar");
	
	a.forEach(i->System.out.println(i));
	 
	}

}
