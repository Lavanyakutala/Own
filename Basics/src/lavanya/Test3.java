package lavanya;

public class Test3 {
                            //global variables
	int a=10;
	int b=22;
	
	public  static void multiply(int a, int b)//method doesn't contain any semicolon
	{                                         //static method called by classname.staticmethod name
		int d=a*b;
		System.out.println("result of this multiplication is" +d);
	
	}
	 public void  add(int a, int b)  //no return type
	 {
		 int c=a+b;
		 System.out.println("my result is"+c);
		
		 
		 
	 }
	public static void main(String[] args)
	{
		Test3 k=new Test3();
		k.add(7,9);                      //normal method by using object reference
		Test3.multiply(7,8);
	}
	
}

