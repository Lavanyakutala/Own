package operators;

public class Increment {

	
	public  static int  preinc( int x)
	{
		int y= ++x ;
		System.out.println("  pre increment of x value:" +y);
	    return y;
	}
	
	
	public static int  postdec( int x)
	
	{
		int y= x--;
		System.out.println("  post Decrement of x value:" +y);
	    return y; 
	}
	
	public static  void main(String[] args)
	
	{
        Increment inc=new Increment();
		inc.preinc(5);
		inc.postdec(5);
	}
	
	
	
}
