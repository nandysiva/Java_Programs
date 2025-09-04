package HomeTask;

import java.util.Scanner;

public class Palindrome {
	int rev=0;
	int digit;
	public int Palin(int a)
	{
		while (a>0)
		{
			digit=a%10;
			rev=rev*10+digit;
			a=a/10;
			System.out.println("Reverse Number"+rev);
		}     
		return rev;
	}
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int a=s.nextInt();
		
		Palindrome p=new Palindrome();
		if(a==p.Palin(a))
		{
			System.out.println("This number is palindrome");
		}
		else  System.out.println("This number is Not palindrome");  
		
		
		s.close();
		
	}

}
