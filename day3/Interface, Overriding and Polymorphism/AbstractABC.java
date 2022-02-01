package co.kishore.day3;

abstract class ABC{
	ABC(){
		
	}
	void show() {
		System.out.println("This is show");
	}
	abstract void show1();
	static void show2() {
		
	}
}
class xyz extends ABC{
	void show1() {
		System.out.println("this show1 is the version of xyz class not the abc class");
		
	}
}

public class AbstractABC {
	public static void main(String[] args) {
		ABC a= new xyz();
		a.show();
		a.show1(); //overides
		a.show2(); ///this is static method 
	}

}
