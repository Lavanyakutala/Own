

package MethodOverloading;

public class DiffParametersChecking {

	public void m1(int a, float b)
	
	{
		float result=a+b;
	
	}
	
	
	public void m1(int a, int b)
	{
		System.out.println("am second method ");
	}
	
	
public static void main(String[] args)
{
	
	DiffParametersChecking ck=new DiffParametersChecking();
	 ck.m1(12, 12.22f);
	 
	
	
	
	
}


}