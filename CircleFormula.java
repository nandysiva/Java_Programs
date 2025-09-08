package HomeTask;

import java.util.Scanner;

public class CircleFormula {

	double radius;
	
	
	public void set(double r)
	{
		radius=r;
	}
	
	public double calculateCirArea()
	{
		return Math.PI*(Math.pow(radius,2));
	}
	
	public double calculateCriCumference()
	{
		return 2*Math.PI*radius;
	}

	public static void main(String[] args) {

      	Scanner s=new Scanner(System.in);
      	
      	System.out.println("Enter the Circle Radius");
      	double r=s.nextDouble();
      	
      	CircleFormula c=new CircleFormula();
      	
      	
      	c.set(r);
      	
      	System.out.println("The Circle Area "+c.calculateCirArea());
      	System.out.println("The Circle CirCumFerence "+c.calculateCriCumference());
      	
      	
      	s.close();
		
	}

}
