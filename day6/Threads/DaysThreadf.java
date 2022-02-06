package co.kishore.day6.thread;

class Days1 extends Thread{
	 
	
	String[] days1= {"monday","tuesday","wednesday","thursday","friday","saturday"};
	int slen= days1.length;
	public void run() {
		for(int j=0 ; j<slen;j++)
		{
			System.out.println(days1[j]);
		}
	}
	 
}
public class DaysThreadf {
	public static void main(String[] args) {
		
		Days1  d=new Days1 ();
		d.start();
	
	}

}
