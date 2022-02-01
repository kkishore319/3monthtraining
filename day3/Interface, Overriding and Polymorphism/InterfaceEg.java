package co.kishore.day3;

interface Car{
	void speed();
	void brake();
	void lights();
}
class luxurycar implements Car{
	public void speed()
	{
		System.out.println("The speed is super fast");
	}
	public void brake()
	{
		System.out.println("Disk brakes");
	}
	public void lights()
	{
		System.out.println("High visioned lights");
	}
}

class cheapcar implements Car{
	public void speed()
	{
		System.out.println("normal speed");
	}
	public void brake()
	{
		System.out.println("not disk brakes");
	}
	public void lights()
	{
		System.out.println("low visioned lights");
	}
}

public class InterfaceEg {
	public static void main(String[] args) {
		Car c= new luxurycar();
		//Car c1= new cheapcar();
		
		c.speed();
		c.brake();
		c.lights();
		
		//c1.speed();
		//c1.brake();
		//c1.lights();
		
	}

}
