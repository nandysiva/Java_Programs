package siva;

import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
	
	System.out.print("Enter the Year : ");
	int a=s.nextInt();

	  
	  if(a%4==0)
	  {
		  System.out.print(a+" is Leap Year!");
	  }
	  if(a%4!=0)
	  {
		  System.out.print(a+" is Leap Not Year!");
	  }

	 s.close();
	}

}
