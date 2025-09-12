package EX;

import java.util.Scanner;

public class UnCommen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Array length");
		int n=s.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("enter "+n+" Element");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			if(a[i]!=0)
			{
				int c=0;
				for(int j=i+1;j<n;j++)
				{
					if(a[i]==a[j])
					{
						c++;
						a[j]=0;
					}
				}
				if(c!=1)
				{
					System.out.println(a[i]);
				}
			}
		}
		
		
		s.close();
		
	}

}
