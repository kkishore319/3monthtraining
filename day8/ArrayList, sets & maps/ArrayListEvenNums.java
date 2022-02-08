package co.kishore.day8.assignments;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

class Evendemo{
	
	ArrayList saveEvenNumbers(int N)
	{
		ArrayList<Integer> ArrayList1= new ArrayList<Integer>();
		
		for(int i=2;i<N;i+=2)
		{
			ArrayList1.add(i);
		}
		
		return ArrayList1;
		
	}
	
	ArrayList printEvenNumbers(ArrayList Arr)
	{
		ArrayList<Integer> ArrayList2=new ArrayList<Integer>();
		int n=Arr.size();
		
		for (int i = 0; i < n; i++) {
			
			int j=(int) (Arr.get(i));
			System.out.println(j*2);
			
			ArrayList2.add(j*2);
			
		}
		return ArrayList2;
	}
	
	
}


public class ArrayListEvenNums {
	public static void main(String[] args) {
		
		Evendemo e=new Evendemo();
		ArrayList Arr=new ArrayList();
		ArrayList A=e.saveEvenNumbers(9);
		System.out.println(A);
		System.out.println(e.printEvenNumbers(A));
		
		
		
		
		
		
		

	}

}
