package co.kishore.day3;

class Engine{
	void Start() {
		System.out.println("The engine starts!! vromm vroommm");
	}
	void Stop() {
		System.out.println("The engine stop.....");
	}
}

class bike{
	void color () {
		System.out.println("The color of the bike is black");
	}
	void speed() {
		System.out.println("The speed of the bike is basic speed");
	}
}
class yamaha extends bike{
	void color() {
		System.out.println("The color of this yamaha is green");
	}
	void speed() {
		System.out.println("The speed of the this yamaha is 300kmph");
	}
	void showbikedetails() {
		Engine yamahaengine=new Engine();
		yamahaengine.Start();
		yamahaengine.Stop();
	}
}


public class vehicle {
	public static void main(String[] args) {
		yamaha y=new yamaha();
		y.showbikedetails();
		y.speed();
		y.color();
	}

}
