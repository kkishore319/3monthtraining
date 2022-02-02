package co.kishore.day4;

interface Admin {

	public abstract void read();

	public abstract String write(int flag);

	double execute(double flag1, double flag2);

}

interface Admin2 {

	public abstract void read();

}

class KishoreSubAdim implements Admin2 {

	@Override
	public void read() {
		// TODO Auto-generated method stub

	}

}

class RohitSubAdmin implements Admin {

	@Override
	public void read() {
		// TODO Auto-generated method stub

	}

	@Override
	public String write(int flag) {

		if (flag == 1) {
			System.out.println(" this is rohit");

		} else {

			System.out.println(" this is not rohit");
		}

		return null;
	}

	@Override
	public double execute(double flag1, double flag2) {
		// TODO Auto-generated method stub
		return 0;
	}

}

public class Interfacedemo{

	public static void main(String[] args) {
		
		
		RohitSubAdmin subadmin = new RohitSubAdmin();

		subadmin.write(3);			
	} 

}


