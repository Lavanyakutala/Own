package lavanya;

public class Test1 {


public int add(int a,int b) // access specifier returntype methodname(parameters/arguments){}
{
	int c = a+b;
	System.out.println("value is "+ c);
	return c;
}



 public static void main(String[] args)
 {
	 Test1 a=new Test1(); // object reference
	 a.add(3,6);
	 
 }
}