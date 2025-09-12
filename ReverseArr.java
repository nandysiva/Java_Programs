package EX;

import java.util.Scanner;

public class ReverseArr {

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
		
		System.out.println("Reverse the Array");
		for(int i=n-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		
		s.close();
		
	}

}
