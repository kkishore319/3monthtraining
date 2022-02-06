package co.kishore.day6.thread;

class SalesPersons extends Thread{
	
	String[] persons= {"jim","dwight","pam","phyllis","stanley"};
	int len=persons.length;
/*	SalesPersons(){
		System.out.println("The sales persons are ");
*/	//}
	public void run () {
		for (int i=0;i<len;i++)
		{
			System.out.println(persons[i]);
		}
	}
	
	
}

public class FiveSalesman {
	public static void main(String[] args) {
		
		SalesPersons s=new SalesPersons();
		s.start();
	
	}

}
