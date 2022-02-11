package co.kishore.day11.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ListStream {
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		for (int i=1;i<10;i++)
		{
			list.add(i);
		}
		Stream<Integer> stream= list.stream();
		stream.forEach(p-> System.out.print(p));
	}

}
