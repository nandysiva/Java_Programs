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
		
		double avg=a+b+c/3;
		double per=(avg/300)*100;
		
		System.out.println("Persentage "+Math.floor(per));
		
		Rank rank;
		
		if(100<per && per>=85) rank=Rank.A;
		else if(85<per && per>=65) rank=Rank.B;
		else if(65<per && per>=55) rank=Rank.C;
		else if(55<per && per>=45) rank=Rank.D;
		else
			rank=Rank.Fail;
		
		System.out.println("your grade is "+rank);
				
		s.close();
		
	}

}
