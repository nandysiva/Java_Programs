package siva;
import java.util.*;

public class Prime {
	

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
		int a=s.nextInt();
		if(a==1)
		{
			System.out.println("Not prime number");
			return;
		}
		if(a==2)
		{
			System.out.println("prime number");
			return;
		}
		if(a==3)
		{
			System.out.println("prime number");	
			return ;
		}	
		if(a%2==0 || a%3==0 || a%5==0 ||a%7==0 ||a%11==0)
		{
			System.out.println("Not prime number");
			return;
		}   
		if(a%2!=0 && a%3!=0)
		{
			System.out.println("prime number");
		} 
		
		s.close();
		
	}

}
