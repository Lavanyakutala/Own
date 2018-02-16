package staticPrograms;

public class StaticInstance {

	static void add()
	{
		System.out.println("am static method" );
	}
	
	public  void mul()
	{
		System.out.println("am instance method");
		
		
     StaticInstance hoo=new StaticInstance();
 
		
       hoo.add();
	
	}
	
	
	
	public static void main(String[] args)
	{
		
		
 StaticInstance dup=new StaticInstance();
 dup.mul();
	}
	
}
