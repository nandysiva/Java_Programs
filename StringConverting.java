package siva;

import java.util.*;

public class StringConverting {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Numeric String : ");
		String s=sc.next();
		
		int i=Integer.parseInt(s);
		float f=Float.parseFloat(s);
		long l=Long.parseLong(s);
		double d=Double.parseDouble(s);
		
		System.out.println("Converts the Numeric String values:");
		System.out.println("Integer Convert : "+i);
		System.out.println("Float Converts : "+f);
		System.out.println("Long Converts : "+l);
		System.out.println("Double Converting : "+d);
		
		sc.close();
		
		
	}

}
