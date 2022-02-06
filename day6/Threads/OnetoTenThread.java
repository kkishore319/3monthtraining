package co.kishore.day6.thread;

/* Create a thread which prints 1 to 10. After printing 5, 
 * there should be a delay of 5000 milliseconds 
 * before printing 6
 *
 */


public class OnetoTenThread extends Thread{
	public static void main(String[] args) {
		
		Thread th=new Thread();
		
		try {
			
			for (int i=1 ; i<=10;i++)
			{
				System.out.println(i);
				if (i==5) {
					th.sleep(5000);
				}
			}
			
		}
		catch(InterruptedException e) {
			System.out.println("Intereption occured");
		}
	}

}
