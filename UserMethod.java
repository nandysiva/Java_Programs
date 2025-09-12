package ExArray;

import java.util.Scanner;

public class UserMethod {
	
	int sum=0;
	public void arr(int a[])
	{
		for (int i : a) {
			
			sum+=i;
		}

	System.out.println("avg "+sum/a.length);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the array");
		int n=s.nextInt();
		
		int a[]=new int[n];
		
		for(int i=0;i>n;i++)
		{
			System.out.println("enter the array element");
			a[i]=s.nextInt();
		}
		
		UserMethod u=new UserMethod();
		
		
		u.arr(a);
		
		s.close();
		
		
	}

}
