package co.win;


class foundation{
	private void show1()
	{
		System.out.println("this is private case");
		
	}
	void show2()
	{
		System.out.println("this is default case");
	}
	protected void show3()
	{
		System.out.println("this is protected case");
		
	}
	public void show4()
	{
		System.out.println("This is default case");
	
		
	}

	
	
	
}

public class Testpackages {
	public static void main(String[] args) {
		foundation s=new foundation();
		//s.show1(); //private variable are only access to it's class only
		s.show2();
		s.show3();
		s.show4();
}
	
	
}
