package EX;

import java.util.Scanner;

public class SecondLar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		
		int se=0,f=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]>f)
			{
				se=f;
				f=a[i];
			}
			else if(a[i]>se)
			{
				se=a[i];
			}
		}
		System.out.println(se);
		s.close();
		
	}

}
