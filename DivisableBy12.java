package HomeTask;

import java.util.Scanner;

public class DivisableBy12 {
	
	public int div(int a)
	{
		if(a%12==0)
		{
			System.out.println("This number is Divisable by 12");
		}
		else
			System.out.println("This number is Not divisable by 12 ");
			
		return a;
	}
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int a=s.nextInt();
		
		DivisableBy12 d=new DivisableBy12();
		d.div(a);
		
		s.close();
		
	}

}
