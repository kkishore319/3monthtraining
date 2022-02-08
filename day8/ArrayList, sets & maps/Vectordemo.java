package co.kishore.day8.collections;

import java.util.Vector;

/*
 * Vector is like the dynamic array which can grow or shrink its size
 * 
 * Vector is synchronized. Java Vector contains many legacy methods that are not
 * the part of a collections framework.
 * 
 * 
 * 
 *
 */

public class Vectordemo {
	public static void main(String[] args) {
		
		Vector<String> v=new Vector<>();
		
		v.add("Tiger");
		v.add("Fox");
		v.add("Lion");
		v.add("Pig");
		v.add("elephant");
		
		v.remove("elephant");
		
		System.out.println("The kings Jungle are "+v);
		System.out.println("the king family size is "+v.size());
		
	}

}
