package EX;

import java.util.Scanner;

public class MinmunArray {

	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Array Element");
		int n=s.nextInt();
		
	    int a[]=new int[n];
	    
	    System.out.println("enter "+n+" Element");
	    for(int i=0;i<n;i++)
	    {
	    	a[i]=s.nextInt();
	    }
	    
	    int min=a[0];
	    for(int i=0;i<n;i++)
	    {
	    	if(a[i]<min)
	    	{
	    		min=a[i];
	    	}
	    }
	    System.out.println("Minimum Number In Array "+min);
		
		s.close();
		
	}
}
