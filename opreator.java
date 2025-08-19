package siva;

import java.util.*;

public class opreator {
	
	
	
	@SuppressWarnings("resource")
	public static void main(String [] nandy)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first number A");
		double a=s.nextDouble();
		System.out.println("enter the second number B");
		double b=s.nextDouble();
		System.out.println("choose the one operator '+ - * / % ':");
		String op=s.next();
		double re=0;
		
		if(op.equals("+")) re=a+b;
		else if(op.equals("-")) 
		{
	    if(b<0)
			 re=a+b;
		else
			 re=a-b;
		}
		else if(op.equals("*")) re=a*b;
		else if(op.equals("/")) re=(b!=0)?(a/b):0;
		else if(op.equals("%")) re=(b!=0)?(a%b):0;
		else 
		{
		System.out.println("invalied operators");	
		return;
		}
		System.out.println(re);
		
		System.out.println('\n');
		
	
		
		String rel=(a>b)? "A is big":(b>a)?"B isbig":"Both are equals";
     	System.out.println(rel+'\n'+'\n');
		
     	
		
		System.out.println("both are positive number "+((a>0)&&(b>0)));
		System.out.println("atleast one positive number "+((a>0)||(b>0)));
		System.out.println("both are not positive number  "+(!((a>0)&&(b>0))));
		
		System.out.println('\n');
		
		
		double n=a;
		System.out.println("a:"+n);
		System.out.println("b:"+b);
		n+=b;
		System.out.println("a+=b:"+n);
		if(b<0)
		{
		n+=b;
		System.out.println("a-=b:"+n);
		}
		else
		{
			n-=b;
			System.out.println("a-=b:"+n);
		}
		if((b!=0))
		{
			n*=b;
			System.out.println("a*=b:"+n);
			n/=b;
			System.out.println("a/=b:"+n);
			n%=b;
			System.out.println("a%=b:"+n);
			
		}
		else
			System.out.println("a*=b:"+b+'\n'+"a/=b:"+b+'\n'+"a%=b:"+b);
		
		
		s.close();
	}

}
