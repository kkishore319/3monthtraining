package co.kishore.day11.Streams;

import java.util.ArrayList;
import java.util.stream.Stream;

class Product{
	int id;
	String name;
	int price;
	
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class StreamFilterdemo {
	public static void main(String[] args) {
		
		ArrayList<Product> arraylist =new ArrayList<Product>();
		
		arraylist.add(new Product(1,"realme",5000));
		arraylist.add(new Product(1,"samsung",2000));
		arraylist.add(new Product(2,"mi",3000));
		arraylist.add(new Product(3,"google",7000));
		arraylist.add(new Product(4,"iphone",8000));
		arraylist.stream().filter(prod->prod.price<5000).map(prod->prod.price).forEach(System.out::println);
		
	}

	 
}
