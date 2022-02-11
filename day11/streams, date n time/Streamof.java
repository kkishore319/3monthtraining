package co.kishore.day11.Streams;

import java.util.stream.Stream;

public class Streamof {
	public static void main(String[] args) {
		Stream<Integer> stream=Stream.of(1,2,3,4,5,6);
		stream.forEach(p->System.out.println(p));
	}
}
