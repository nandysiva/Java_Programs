package Array;

import java.util.Scanner;

public class MatrixMultiple {

	public static void main(String[] args) {

		
		Scanner s=new Scanner(System.in);
		
		System.out.println("1th Array");
		int a=s.nextInt();
		int a1=s.nextInt();
		
		System.out.println("2th Array");
        int b=s.nextInt();
        int b1=s.nextInt();
        
        int i,j;
        
        
        int a2[][]=new int[100][100];
        int b2[][]=new int[100][100];
        
        if(a1==b)
        {
        
        for(i=0;i<a;i++)
        {
        	for(j=0;j<a1;j++)
        	{
        		System.out.println("1th Array Element");
        		a2[i][j]=s.nextInt();
        	}
        }
        
        for(i=0;i<b;i++)
        {
        	for(j=0;j<b1;j++)
        	{
        		System.out.println("2th Array Element");
        		b2[i][j]=s.nextInt();
        	}
        }
        
        int c[][]=new int[100][100];
        
       
        
        for(i=0;i<a;i++)
        {
        	for(j=0;j<b1;j++)
        	{
        		for(int k=0;k<a1;k++)
        		{
        			c[i][j]+=a2[i][k]*b2[k][j];
        		}
        		
        		System.out.print(c[i][j]+" ");
        	}
        	
        	
        	System.out.println();
        	
        	
        }
        }
        else
        {
        	System.out.println("Matrix not Multiplication");
        }
        
        
		
		
		s.close();
		
	}

}
