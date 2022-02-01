package co.kishore.day2;

import java.util.Scanner;

class bank{
	int deposite(int amount,int dep) {
		return amount=amount+dep;
	}
	int withdraw(int amount,int with) {
		if (amount>=with) {
			amount=amount-with;
		}
		else {
			System.out.println("insuffient bal");
		}
		return amount;
		
	}
}

public class Zeezeebank {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account number");
		int accno=sc.nextInt();
		System.out.println("Enter intial bal");
		int intbal=sc.nextInt();
		System.out.println("Enter amount to deposite");
		int dep=sc.nextInt();
		bank d=new bank();
		int avail = d.deposite(intbal, dep);
		
		System.out.println("Available balance is "+avail);
		System.out.println("Enter amount for withdrw");
		int withd=sc.nextInt();
		bank w =new bank();
		int rem=w.withdraw(avail, withd);
		System.out.println("Remining balce is "+rem);
		
		}

}
