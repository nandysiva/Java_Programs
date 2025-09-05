package HomeTask;

import java.util.Scanner;

public class TernaryDiv2 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the number");
		int a=s.nextInt();
		
		String Div=(a%2==0)?"This number is Divisable by 2":"This number is not Divisable by 2";
		
		System.out.println(Div);
		
		
		s.close();
		
	}

}
