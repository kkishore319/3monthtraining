package co.kishore.day8.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapdemo {
	public static void main(String[] args) {
		
		Map<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(1, "ninnu champadam ");
		map1.put(2 , "ninnu champadam ");
		map1.put(3, "ninnu champadam ");
		map1.put(4,"ninnu champadam ");
		map1.put(5,"ninnu champadam ");
		
		Set set= map1.entrySet();
		
		Iterator iter= set.iterator();
		while(iter.hasNext())
		{
			 Map.Entry<Integer, String> entry =(Map.Entry<Integer, String>) iter.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}		
		
	}

}
