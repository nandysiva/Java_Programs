package EX;

import java.util.Scanner;

public class FequenceArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			
		}
		
		for(int i=0;i<n;i++)
		{
			if(a[i]!=0)
			{
				int c=1;
				for(int j=i+1;j<n;j++)
				{
					if(a[i]==a[j])
					{
						c++;
						a[j]=0;
					}
				}
				System.out.println(a[i]+"-->"+c);
			}
			
			
		}
		
		
		
		
		s.close();
		
	}

}
