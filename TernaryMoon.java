package HomeTask;

import java.util.Scanner;

public class TernaryMoon {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Moonsoon");
		String moon=s.next();
		
		String soon=(moon.equals(moon)||moon.equals("summer"))?"March to May":
			        (moon.equals(moon)||moon.equals("rainy"))?"June to September":
			        (moon.equals(moon)||moon.equals("winter"))?"December to February":"Invalided MonSoon";
		
		System.out.println(soon);
		
		s.close();
		
		
	}
	
	

}
