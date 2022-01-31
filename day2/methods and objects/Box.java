package co.win;



class vol{
	double vol(double width,double height,double depth)
	{
		return width*height*depth;
	}
}

public class Box {
	public static void main(String[] args) {
		vol v1=new vol();
		double res=v1.vol(1,2,3);
		System.out.println("The volume of the box "+res);
	}
}

