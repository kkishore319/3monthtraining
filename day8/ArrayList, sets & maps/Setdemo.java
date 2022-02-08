package co.kishore.day8.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Setdemo {
	public static void main(String[] args) {
		
		 
		Set<String> set11= new HashSet<>();
		Set<String> set1=new LinkedHashSet<>();
		
		set1.add( "I");
		set1.add("I");
		set1.add( "am");
		set1.add( "Kishore");
		set1.add("Kumar");
		set1.add("Kishore");
		
		Iterator iter= set1.iterator();
		
		if (iter !=null)
		{
			while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		}
		
	}

}
