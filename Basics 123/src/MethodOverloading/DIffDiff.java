package MethodOverloading;

public class DIffDiff {

	

int a,b,c;
	
	public void add(int a,float b,double c)
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
	
	 DIffDiff d=new DIffDiff();
	 d.add(8, 10);
	 d.add(6,10.3f, 12.11);
 }
 
}
