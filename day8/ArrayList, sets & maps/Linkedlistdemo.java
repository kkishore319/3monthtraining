package co.kishore.day8.collections;

/* The important points about Java LinkedList are:
Java LinkedList class can contain duplicate elements.
Java LinkedList class maintains insertion order.
Java LinkedList class is non synchronized.
In Java LinkedList class, manipulation is fast because no shifting needs to occur.
Java LinkedList class can be used as a list, stack or queue.
 * 
 */

import java.util.LinkedList;

public class Linkedlistdemo {
	public static void main(String[] args) {
		
		LinkedList<String> l=new LinkedList<String>();
		
		l.add("King");
		l.add("Queen");
		l.add("Jack");
		l.add("Numbers");
		l.add("pleaures");
		l.add(4, "Joker");


		for (String string : l) {
			System.out.println("The members of beast pirates are "+string);
			
		}
		
		l.addFirst("Kaido");
		l.addLast("Tobi Rappo");
		 
		for (String string : l) {
			System.out.println("The beast pirates are "+string);
		}

	
	}

}
