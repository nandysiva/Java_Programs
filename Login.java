package HomeTask;

import java.util.Scanner;

public class Login {
public static void main(String[] args) {
	
	String user="sivaprakash";
	String pass="123456";
	
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter  the  username");
	String name=s.next();
	System.out.println("Enter the password ");
	String word=s.next();
	
	login1 l=new login1();
	
	l.set(user, pass);
	
	System.out.println("username: "+l.getuser());
	System.out.println("password: "+l.getpass());

	l.check(name, word);
	
	s.close();
	
}
}
class login1
{
	private String username;
	private String password;
	
	public void set(String u,String p)
	{
		username=u;
		password=p;
	}
	public String getuser()
	{
		return username;
	}
	public String getpass()
	{
		return password;
	}
	public void check(String u,String p)
	{
		if(username.equals(u) && password.equals(p)) {
			System.out.println("Login Successfull");
		}
		else
		{
			System.out.println("Login UnSuccessfull");
		}
	}
}
