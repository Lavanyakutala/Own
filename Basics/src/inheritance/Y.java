package inheritance;

 class P{

	int m1()
	{
		System.out.println("Hi am m1 of class A");
		
		return 20;
	}
	
	
	
	
	
	int m3()
	{
		System.out.println("Hi am m3 of class A");
		
		return 40;
	}
}

 // am overriding A class in B class, now mention B as public, so that we can do override.
 //in which class you are over riding, in that class you can write main method


public class Y extends P{
	
	
	int m4()
	{
		System.out.println("Hi am m4 of class B");
		
		return 12;
	}
	
	
	
	int m3()
	{
		System.out.println("Hi am m3 of class B");
		
		return 1000;
	}
	
	
	
	
	

	
	
		
	public static void main(String[] args)
	{
		
		
	Y obj=new Y();
		obj.m4();
		obj.m3();
		
		
	P obj1=new Y();
	obj1.m3();
		
	
	}
	
	
}
	
	
