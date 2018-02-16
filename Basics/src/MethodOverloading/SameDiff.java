package MethodOverloading;

public class SameDiff {
	

	public void  add(float a,float b)
	{
		
		System.out.println("Hi am good");
	}
	
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Hi am almost good:"+c);
		
	}
	
	public static void main(String[] args)
	{
		SameDiff ad=new SameDiff();
		ad.add(12, 22);
		ad.add(12.1f, 12.4f);
		
	}

	
	
	
}
