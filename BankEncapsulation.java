package HomeTask;

import java.util.Scanner;

public class BankEncapsulation {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Account Number");
		String ac=s.next();
		System.out.println("Enter the Amount");
		int bal=s.nextInt();
		
		Bank b=new Bank();
		
		b.set(ac, bal);
		b.getBal();
		
		System.out.println("\nEnter the Deposit Amount");
		int a=s.nextInt(); 
		
		 System.out.println("Balance Amount "+b.deposit(a));
		 
		 
		 System.out.println("\nEnter the WithDraw Amount");
		 int w=s.nextInt(); 
		 
		 System.out.println("Balance Amount "+b.withdraw(w));
		 
		 
		 
		
		s.close();
		
	}
}

class Bank{
	
	private  String Accno;
	private int  Bal;
	int amount;
	
	public void set(String a,int b)
	{
		Accno=a;
		Bal=b;
	}
	public int deposit(int a)
	{
		amount =Bal+a;
		System.out.println("Account No is "+Accno);
		return amount;	
	}
	public int withdraw(int a)
	{
		amount-=a;
		System.out.println("Account No is "+Accno);
		return amount;
	}
	void getBal()
	{
		System.out.println("Account No is "+Accno);
		System.out.println("Account Balance is "+Bal);
	}
}
