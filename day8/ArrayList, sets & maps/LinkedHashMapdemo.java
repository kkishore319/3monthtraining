package co.kishore.day8.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapdemo {
	public static void main(String[] args) {
		
		Map<Integer,String> map1=new LinkedHashMap<Integer, String>();
		
		map1.put(0, "Hai");
		map1.put(1, "hello");
		map1.put(2, "Good");
		map1.put(3, "Morning");
		
		Set set1 =map1.entrySet();
		
		Iterator iter = set1.iterator();
		
		while (iter.hasNext())
		{
			Map.Entry<Integer,String >entry=(Map.Entry<Integer, String>) iter.next();
			System.out.println("key is "+entry.getKey()+" and value is "+entry.getValue());
		}
		
	}

}
