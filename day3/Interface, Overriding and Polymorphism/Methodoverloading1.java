package co.kishore.day3;

class circle11 {
	void Area(double radius)
	{
		double result=(3.14*radius)*radius;
		System.out.println(result);
	}
	double Area(double len,double bre) {
		double result= len*bre;
		return result;
	}
}

public class Methodoverloading1 {
	public static void main(String[] args) {
		circle11 c = new circle11();
		c.Area(2.5);
		double temp =c.Area(11,13);
		System.out.println(temp);
	}

}
