package siva;

import java.util.*;
	 
	


public class methods {
	
	public static double ctof(double a)
	{
		return (a*9/5)+32;
	}
	public static double ctok(double a)
	{
		return (a+273.15);
	}
	public static double ftoc(double a)
	{
		return (a-32)*5/9;
	}
	public static double ftok(double a)
	{
		return (a-32)*5/9+273.15;
	}
	public static double ktoc(double a)
	{
		return (a-273.15);
	}
	public static double ktof(double a)
	{
		return (a-273.15)*9/5+32;
	}
	

	public static void main(String[] args) {

	  Scanner s=new Scanner(System.in);
	  System.out.println("enter the Celsius:");
	  double a=s.nextDouble();
	  System.out.println("enter the Fahrenheit:");
	  double b=s.nextDouble();
	  System.out.println("enter the Kelvin:");
	  double c=s.nextDouble();
	  System.out.println(a+"C to Fahrenheit "+ctof(a));	
	  System.out.println(a+"C to Kelvin "+ctok(a));	
	  System.out.println(b+"F to Celsius "+ftoc(b));	
	  System.out.println(b+"F to kelvin "+ftok(b));	
	  System.out.println(c+"K to Celsius "+ktoc(c));	
	  System.out.println(c+"K to Fahrenheit "+ktof(c));	
	  
	  s.close();
		
	}

}
