package siva;

import java.util.*;

public class OddEven {
	
	public static void main(String [] nandy)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		Double a=s.nextDouble();
		
		if(a%2==0)
		{
			System.out.println("This Number is Even : "+a);
		}
		if(a%2!=0)
		{
			System.out.println("This Number is Odd : "+a);
		}
		
		s.close();
	}

}
