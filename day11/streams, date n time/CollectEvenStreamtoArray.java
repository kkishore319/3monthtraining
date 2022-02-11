package co.kishore.day11.Streams;

import java.util.ArrayList;
import java.util.List;
 
import java.util.stream.Stream;

public class CollectEvenStreamtoArray {
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		
		for (int i=1;i<21;i++) 
		{
			list.add(i);
		}
		
		Stream<Integer> stream= list.stream();
		Integer[] evenNumberarr=stream.filter(i->i %2==0).toArray(Integer[]::new);
		System.out.println(evenNumberarr);
	}

}
