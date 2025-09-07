package HomeTask;

import java.util.Scanner;

enum Rank{A,B,C,D,Fail}


public class EnumRank {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 3 Subject Marks");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		double avg=(a+b+c)/3;
		
		System.out.println("Your avg "+avg);
		
		Rank rank;
		
		if(100<avg || avg>=85) rank=Rank.A;
		else if(85<avg || avg>=65) rank=Rank.B;
		else if(65<avg || avg>=55) rank=Rank.C;
		else if(55<avg || avg>=45) rank=Rank.D;
		else
			rank=Rank.Fail;
		
		System.out.println("your grade is "+rank);
				
		s.close();
		
	}

}
