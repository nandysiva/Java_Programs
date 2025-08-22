package siva;
import java.util.*;

public class Reverse {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("enter the 8 digit number:");
		int a=s.nextInt();
		long re=0;
		
		if(a>0)
		{
			long c=a/10000000;
			long tl=(a/1000000)%10;
			long l=(a/100000)%10;
			int tth=(a/10000)%10;
			int th=(a/1000)%10;
			int h=(a/100)%10;
			int t=(a/10)%10;
			int o=a%10;
			
			re=o*10000000+t*1000000+h*100000+th*10000+tth*1000+l*100+tl*10+c;
		}
		System.out.println(re);
		s.close();
		
	}

}
