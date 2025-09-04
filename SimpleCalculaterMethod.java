package HomeTask;

import java.util.Scanner;

public class SimpleCalculaterMethod {
	
	public int Add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public int Sub(int a,int b)
	
	{
		int c;
		if(b>0)
	    {
     	c=a-b;
		return c;
	    }
		else
		c=a+b;
		return c;
	}
	public double Mul(double a,double b)
	{
		double c=a*b;
		return c;
	}
	public double Div(double a,double b)
	{
		double c=a/b;
		return c;
	}
	
	
	public static void main(String[] args) {
		
		SimpleCalculaterMethod m=new SimpleCalculaterMethod();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 1th number");
		int a=s.nextInt();
		System.out.println("Enter the 2th number");
		int b=s.nextInt();
		
		System.out.println("First two number Add "+m.Add(a, b));
		System.out.println("First two number Subtract "+m.Sub(a, b)); 
		System.out.println("First two number Multiple "+m.Mul(a, b)); 
		System.out.println("First two number Division  "+m.Div(a, b)); 
		s.close();
	}

}
