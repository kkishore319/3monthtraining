package co.kishore.day3;
//Create  a base class Fruit which has name ,taste and size as its attributes. 
//A method called eat() is created which describes the name of the fruit and its taste.  
//Inherit the same in 2 other class Apple and Orange and 
//override the eat() method to represent each fruit taste.

class Fruitt
{
	void name()
	{
		System.out.println("Fruit name");
	}
	void taste()
	{
		System.out.println("Fruit taste");
	}
	void size()
	{
		System.out.println("Fruit size ");
	}
	void eat()
	{
		System.out.println("fruit is eatable");
	}
}
class Apple extends Fruitt
{
	public void eat() {
			System.out.println("  APPLE and is SWEET");
	}
}
class Orange extends Fruitt
{
	public void eat() {
		System.out.println(" ORANGE and  is TANGY");
}
}
public class Fruit {

	public static void main(String[] args) 
	{
		
		Fruitt f= new Apple();
		f.eat();

	}

}
