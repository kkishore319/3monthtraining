package com.test2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class GetLeastNaturalnumberOutofGiven {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("hom many are you going to enter ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();		
		}
		GetLeastNaturalnumberOutofGiven g=new GetLeastNaturalnumberOutofGiven();
		System.out.println(g.solution(arr));
		sc.close();
		
	}
	
	public int solution(int arr[]) {
		int n=arr.length;
		HashSet set=new HashSet();
		for (Object object :arr) {
			set.add(object);
			
		}


		for(int i=1;i<=n+1;i++) {
			if(!(set.contains(i))) {
				return i;
			}
		}
		return 0;	
	}

}
