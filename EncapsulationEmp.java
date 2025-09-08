package HomeTask;

import java.util.Scanner;

public class EncapsulationEmp {
	
	private String name;
	private int sal;
	
	private void setEmp(String n,int s)
	{
		name=n;
		sal=s;				
	}
	private String getName()
	{
		return name;
	}
	private int getSal()
	{
		return sal;
	}
		
	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		
		 System.out.println("Enter the Emp Name");
		 String n=s.next();
		 System.out.println("Enter the Emp Salary ");
		 int sal=s.nextInt();
		 
		 
		 EncapsulationEmp e=new EncapsulationEmp();
		 
		 e.setEmp(n, sal);
		 System.out.println("Employee Name is "+e.getName());
		 System.out.println("Employee Salary is "+e.getSal());
		
		s.close();
		
		
	}

}
