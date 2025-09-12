package ExArray;

import java.util.Scanner;

public class Found {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		int a[]= {5,8,9,2,10};
		
		System.out.println("found element");
		int f=s.nextInt();
		
		boolean fo=false;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==f)
			{
				fo=true;
			}
			
		}
		if(fo==true)
		{
			System.out.println("found the element");
		}
		else
			
		{
			System.out.println(" Not found the element");
			
		}
		

		s.close();
	}

}
