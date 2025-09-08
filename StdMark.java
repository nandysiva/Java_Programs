package HomeTask;


public class StdMark {

	public static void main(String[] args) {
		
		String r="PG123";
		String n="Nandy";
		int mark=100;
		
		Std1 s=new Std1();
		s.set(r, n, mark);
		
		System.out.println("Your Roll Number is "+s.getRoll());
		System.out.println("Your Name is "+s.getName());
		System.out.println("Your Mark is "+s.getMark());

	}

}
class Std1{
	
	 private String rollno;
	 private String name;
	 private int mark;
	 
	 public void set(String r,String n,int m)
	 {
		 rollno=r;
		 name=n;
		 mark=m;
	 }
	 public String getRoll()
	 {
		 return rollno;
	 }
	 public String getName()
	 {
		 return name;
	 }
	 public int getMark()
	 { 
		 if(mark<0)
		 {
			 System.out.println("❌ Not declear the Negative Mark");
			 mark=0;
		 }
		 return mark ;
		 
	 }
		 
	 
}
