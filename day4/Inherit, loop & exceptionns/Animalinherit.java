package co.kishore.day4;

 class Animal{
	 void eat()
	 {
		 System.out.println("animal eat");
	 }
	 void sleep()
	 {
		 System.out.println("animal sleep");
	 }
 }
 class Bird extends Animal{
	 void eat()
	 {
		 System.out.println("bird eat");
	 }
	 void sleep()
	 {
		 System.out.println("bird sleep");
	 }
	 void fly()
	 {
		 System.out.println("bird is flying ");
	 }

 }

public class Animalinherit {
	public static void main(String[] args) {
		Animal a=new Animal();
		a.eat();
		a.sleep();
		Animal b=new Bird();
		b.eat();
		b.sleep();
		//b.fly();
		Bird b1= new Bird();
		b1.fly();
	}

}
