package EX;

import java.util.Scanner;

public class LargestArr {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Array Length");
		int n=s.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("Enter "+n+" Element");
		for(int i=0;i<n;i++)
		{
			
			a[i]=s.nextInt();
		}
		
		int max=a[0];
		for(int i=0;i<n;i++)
		{
		if(a[i]>max)
		{
			max=a[i];
		}
		}
		System.out.println("The Maximum Element "+max);
		
		s.close();
		
		
	}

}
