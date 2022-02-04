package co.kishore.day6.thread;

import java.util.Random;

class Randomcolor extends Thread implements Runnable{
	
	String[] colors= {"white","blue","black","green","red","yellow"};
	int b= colors.length;
	 
	public void run(){
		Random r=new Random();
		for (int i=0;i<b;i++)
		{
			int select = r.nextInt(b);
			System.out.println("selected color is "+colors[select]);
			if (colors[select] == "red") {
				break;
			}
		}
	 
		
	}
	
	
}


public class ColorThread {
	public static void main(String[] args) {
		Randomcolor rr=new Randomcolor();
		rr.start();
		
	}
}
