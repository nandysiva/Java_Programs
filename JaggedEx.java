package ExArray;

import java.util.Scanner;

public class JaggedEx {

	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		
		
		System.out.println("enter rows");
		int r=s.nextInt();
		
		int jag[][]=new int [r][];
		
		for(int i=0;i<r;i++)
		{
			System.out.println(i+" Row How Many Element");
			int ja=s.nextInt();
			
			jag[i]=new int[ja];
			
			for(int j=0;j<ja;j++)
			{
				System.out.println("jagged arrays Elements");
				jag[i][j]=s.nextInt();
			}
			
		}
		
		
		for(int i=0;i<jag.length;i++)
		{
			for(int j=0;j<jag[i].length;j++)
			{
				System.out.print(jag[i][j]+" ");
			}
			
			System.out.println();
		}
		
		
		s.close();
		
	}
}
