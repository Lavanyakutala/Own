package AccessModifiers;

public class PrivateFields {

	private int x=10,y=20;
									//access modifiers for outerclass=public,default
									//NAM=final,abstract,strict fp;

									//we cant access private methods in another class,restricted to single class
		
	
	private void method()
	{
		System.out.println("am private method");
		
	}}
class O{
	
	
	public static void main(String[] args)
	
	{
		PrivateFields lol=new PrivateFields();
		lol.method();
		
	       System.out.println(lol.x);
	       System.out.println(lol.y);
		
	
	}

}