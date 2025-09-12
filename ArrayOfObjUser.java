package ExArray;

import java.util.Scanner;

public class ArrayOfObjUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		System.out.println("how many obj");
		int o=s.nextInt();
		
		std arr[]=new std[o];
		
		for(int i=0;i<o;i++)
		{
		    System.out.println(i+" Array Name and Id"); 
			System.out.println("name");
			String name=s.next();
			System.out.println("id");
			int id=s.nextInt();
			
			arr[i]=new std();
			arr[i].std1(name, id);
			
		}
		
		for(int i=0;i<o;i++)
		{
			arr[i].dis();
		}
		
		
		s.close();
		
		
	}

}
class std{
	
	String name;
	int id;
	
	public void std1(String n,int i)
	{
		name=n;
		id=i;
	}
	
	void dis()
	{
		System.out.println(name+"  "+ id);
	}
}
