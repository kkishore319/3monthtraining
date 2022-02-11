package co.kishore.day9.queuesandfileReader;

class Templat<T> {
	T t;
	Templat(T t) {
		this.t=t;
				System.out.println(t);
	}
	
	
}

public class Templatedemo {
	public static void main(String[] args) {
		
		Templat t1=new Templat("1");
		Templat t2=new Templat(4);
		Templat t6=new Templat(4.8);
		Templat t21=new Templat("kungfu");
	}

}
