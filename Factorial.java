package HomeTask;

import java.util.Scanner;

public class Factorial
{
	int f=1;
	int i=1;
	public long Fact(long a)
	{
		while (a>=i) {
			
			f*=i;
			i++;
		}
		return f;
	}
	
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Factorial Number");
		long a=s.nextInt();
		Factorial f=new Factorial();
		
		System.out.println(f.Fact(a));
		
		s.close();
		
		
	}

}
