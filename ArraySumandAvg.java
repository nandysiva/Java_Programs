package EX;

import java.util.Scanner;

public class ArraySumandAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Array Length");
		int n=s.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("enter "+n+" Element");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		double sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=a[i];
			
		}
	    System.out.println("SumOfArray "+sum);
	    System.out.println("AvgOfArray "+sum/n);
		
		s.close();
		
	}

}
