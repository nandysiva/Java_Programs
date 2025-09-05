package HomeTask;

import java.util.Scanner;

enum color{Stop,Ready,Go}

public class EnumColor {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Your Color");
		String col=s.next();
		
		color Color=null;
		if(col.equals("red")) Color=color.Stop;
		else if(col.equals("yellow")) Color=color.Ready;
		else if(col.equals("green")) Color=color.Go;
		System.out.println(Color);
		s.close();
		
	}

}
