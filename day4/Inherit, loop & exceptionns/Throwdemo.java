package co.kishore.day4.exception;

import java.io.IOException;

//import java.io.IOException;

class M{
	
	void show() throws IOException {
		
		System.out.println("inside show()");
		
		throw new IOException("device error");
		
	}
	
}





public class Throwdemo {

	public static void main(String[] args) {
		
		M s = new M();
		
		try {
			s.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}