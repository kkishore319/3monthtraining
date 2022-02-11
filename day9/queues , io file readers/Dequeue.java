package co.kishore.day9.queuesandfileReader;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue {
	public static void main(String[] args) {
		
		Deque<String> dq=new ArrayDeque<>();
		
		dq.add("Kota");
		dq.add("Kishore");
		dq.add( "Kumar");
		
		for (String string : dq) {
			System.out.println(string);
		}
		
	}

}
