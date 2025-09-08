package HomeTask;

import java.util.Scanner;

public class InterFaceCalculator {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the 1th Number");
		double a=s.nextInt();
		
		System.out.println("Enter the 2th Number");
		double b=s.nextDouble();
		
		Calculate1 c=new Calculate1();
		
		c.set(a, b);
		
		System.out.println("Add Two Number "+c.add());
		System.out.println("Subtract Two Number "+c.sub());
		System.out.println("Multiple Two Number "+c.mul());
		System.out.println("Divided Two Number "+c.div());
		
		s.close();
		
	}
}
interface Calculate
{
	 double add();
	 double sub();
	 double mul();
	double div();
}
class Calculate1 implements Calculate
{
	double a,b,c;
	
	public void set(double a,double b)
	{
		this.a=a;
		this.b=b;
	}
	public double add()
	{
		return (a+b);
	}
	public double sub()
	{
		if(b>0)
		{
			c=a-b;
		}
		else
		{
			c=a+b;
		}
		return c;
	}
	public double mul()
	{
		return (a*b);
	}
	public double div()
	{
		return (a/b);
	}
	
	
}
