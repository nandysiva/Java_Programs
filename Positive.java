package siva;

import java.util.*;

public class Positive {

	public static void main(String [] nandy)
	{
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		double a=s.nextDouble();
		
		if(a>0)
		{
			System.out.println("This Number Is Positive: "+a);
		}
		if(a<0)
		{
			System.out.println("This Number Is Negative: "+a);
		}
		if(a==0)
		{
			System.out.println("This Number Is Zero: "+a);	
		}
		
		s.close();
		
	}
}
