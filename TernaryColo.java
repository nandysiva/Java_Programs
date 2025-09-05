package HomeTask;

import java.util.Scanner;

public class TernaryColo {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		
		System.out.println("enter your color RGB");
		String col=s.next();
		
		String color=(col.equals(col)||col.equals("r"))?"RED Color":
			         (col.equals(col)||col.equals("g"))?"GREEN Color":
			         (col.equals(col)||col.equals("b"))?"BLUE Color":"Invalided Color";
		
		System.out.println(color);
		
		
		s.close();
		
	}

}
