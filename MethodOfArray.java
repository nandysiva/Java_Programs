package ExArray;

public class MethodOfArray {

	public void Arr(double a[])
	{
		double sum=0;
		for (int i=0;i<a.length;i++) {
			
		 sum+=a[i];
			
		}
		
		System.out.println((double)(sum/a.length));
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double a[]= {5,3,8,9};
		
		MethodOfArray m=new MethodOfArray();
		
		m.Arr(a);
		
	}

}
