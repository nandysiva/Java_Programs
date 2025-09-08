package HomeTask;

import java.util.Scanner;

public class EmpDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner s=new Scanner(System.in);
		 
		 System.out.println("Enter the Emp Name");
		 String n=s.next();
		 System.out.println("Enter the Emp Salary ");
		 int sal=s.nextInt();
		 
	     Emp e=new Emp();
	     
	     e.displayDetails(n, sal);
				
		 
		 
		 s.close();

	}

}
class Emp
{
	String name;
	int salary;
	
	public void displayDetails(String n,int s)
	{
		name=n;
		salary=s;
		
		System.out.println("Employee name is "+name);
		System.out.println("Employee Salary is "+salary);
	}
	
}
