package ExArray;

import java.util.Scanner;

public class ReplaceMent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {5,2,6,8,9,2,1};
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Which position is replace");
		int p=s.nextInt();
		
		System.out.println("repleac number");
		int r=s.nextInt();
		
		if(a[p]>=0)
		{
			a[p]=r;
		}
		
		for (int i : a) {
			
			System.out.println(i);
			
		}
		
				
				
		s.close();		
	}

}
