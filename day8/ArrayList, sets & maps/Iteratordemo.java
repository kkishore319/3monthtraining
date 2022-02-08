package co.kishore.day8.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratordemo {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("apple");
		list.add("kishore");
		list.add("santhosh");
		list.add("binge");
		
		Iterator iter= list.iterator();
		
		while (iter.hasNext())
		{
			System.out.println(iter.next());
		}


	}

}