package co.kishore.day9.queuesandfileReader;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashmapdemo {
	public static void main(String[] args) {
		
		ConcurrentHashMap<Integer, String> m=new ConcurrentHashMap<Integer,String>();
		
		m.put(1, "Kota");
		m.put(2, "Kishore");
		m.put(3, "Kumar");
		m.putIfAbsent(0, "Mr.");
		
		System.out.println(m);
		
	}

}
