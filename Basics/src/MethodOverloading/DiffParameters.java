package MethodOverloading;

public class DiffParameters {

	
	public void add(int a,int b,int c)
	{
		
		System.out.println("Hi am good");
	}
	
	public void add(int a,int b)
	{
		
		System.out.println("Hi am  not good");
	}
	
	

 public static void main(String[] args)
 {
	 DiffParameters myfirst=new DiffParameters();
	 myfirst.add(7, 9);
	 myfirst.add(7, 5, 3);
	 
 }
 
}