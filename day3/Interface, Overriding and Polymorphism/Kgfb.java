package co.kishore.day3;

import java.util.Scanner;

class Bankdetails{
	int personalDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your acc num");
		int accno=sc.nextInt();
		System.out.println("Enter your name ");
		String name=sc.next();
		System.out.println("Enter the bal");
		int bal=sc.nextInt();
		System.out.println("Enter the number of years");
		int yrs=sc.nextInt();
		System.out.println("Customer name "+name);
		System.out.println("Account number "+accno);
		System.out.println("Account balance "+(double)bal);
		return yrs;
	}
}
class CalMaintainCharge{
	double Savings(double n)
	{
		double maintaincharge;
		maintaincharge=(50*n)+50;
		return maintaincharge;
		
	}
	double Current(double n)
	{
		double maintaincharge;
		maintaincharge=(100*n)+200;
		return maintaincharge;
	}
}


public class Kgfb {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Savings account");
		System.out.println("2. Current account");
		System.out.println("Enter your choice");
		int choice =sc.nextInt();
		switch(choice) {
		
		case 1: 
			Bankdetails b1=new Bankdetails();
			double n1=b1.personalDetails();
			CalMaintainCharge c1=new CalMaintainCharge();
			double mc1=c1.Savings(n1);
			System.out.println("Maintenance Charge for Savings Account is rs."+mc1);
			break ;

		case 2:
			Bankdetails b2=new Bankdetails();
			double n2=b2.personalDetails();
			CalMaintainCharge c2=new CalMaintainCharge();
			double mc2 =c2.Current(n2);
			System.out.println("Maintenance Charge for Current Account is rs."+mc2);
			break;
		default:
			System.out.println("Enter 1 or 2");
			break;

		
		}
	
	}

}
