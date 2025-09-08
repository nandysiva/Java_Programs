package HomeTask;

import java.util.Scanner;

public class StdObj {

	String name;
	int  age;
	
	public void std(String n,int a)
	{
		name=n;
		age=a;
	}
	void dis()
	{
		System.out.println("Your name is "+name);
		System.out.println("Your age is "+age);
	}
	
	
	public static void main(String[] args) {
		
		StdObj S=new StdObj();
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the name ");
		String n =s.next();
		System.out.println("Enter the age");
		int a=s.nextInt();
		
		S.std(n, a);
		
		S.dis();
		
		
		s.close();
		
		
		

	}

}
