package co.kishore.day8.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

 

public class TreeSetdemo {
	public static void main(String[] args) {
		
		Set set=new TreeSet();


		
		set.add("k");
		set.add("i");
		set.add("s");
		set.add("h");
		set.add("o");
		set.add("r");
		set.add("e");
		//set.add(null);
		
		Collections.synchronizedCollection(set);
	
		Iterator iter= set.iterator();
		if (iter!=null) {
			while(iter.hasNext())
			{
				System.out.println(iter.next());
			}
		}
		
	}

}
