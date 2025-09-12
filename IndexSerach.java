package ExArray;

import java.util.Scanner;

public class IndexSerach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the arry");
		int n=s.nextInt();
		
	     int a[]=new int[n];
	     
	     for(int i=0;i<n;i++)
	     {
	    	 System.out.println("entr the array elemetn");
	    	 
	    	 a[i]=s.nextInt();
	     }
	     
	     System.out.println("Enter the Index Values (0 - "+(n-1)+")");
	     int i=s.nextInt();
	     
	     if(i>=0 && i<n)
	     {
	    	 System.out.println(i+" position Element is "+a[i]);
	     }
	     else
	     {
	    	 System.out.println("Include the Index Values (0 - "+(n-1)+")");
	     }
	     
	     
		s.close();
		
	}

}
