package co.kishore.day8.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class NavigableMapdemo {
	public static void main(String[] args) {
		
		NavigableMap<Integer, String> map=new TreeMap<Integer,String>();
		
		map.put(1, "wake");
		map.put(2, "wash");
		map.put(3, "clean");
		map.put(4,"dress");
		map.put(5, "eat");
	
		Set set=map.entrySet();
		
		Iterator iter=set.iterator();
		
		while(iter.hasNext())
		{
			Map.Entry<Integer, String> entry=(Map.Entry<Integer, String>) iter.next();
			System.out.println("The key is "+entry.getKey()+" and thing to do is "+entry.getValue());
		}
	}

}
