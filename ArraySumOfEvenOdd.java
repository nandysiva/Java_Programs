package EX;

import java.util.Scanner;

public class ArraySumOfEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the Array length");
		int n=s.nextInt();
		
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			
		}
		int even=0,odd=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
			 even+=a[i];
			}
			else
			{
				odd+=a[i];
			}
		}
		System.out.println("SumOfEven "+even);
		System.out.println("SumOfOdd "+odd);
		
		
		s.close();
		
	}

}
