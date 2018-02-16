package lavanya;

public class Test2 {



//how to create a class, object , and method its signature



	int a=10;
	int b=20;//global variable

      //static level
	static int c=30;       //using globalvariables in static method
	
	//static method 
	public static void multiply(int a,int b){
		int c=a*b;
		System.out.println(c);
	}
	
	//default constructor
	public Test2(){
		
	}
	
	public int add(int a,int b) // accessspecifier returntype methodname(parameters/arguments){}
	{
		int c = a+b;
		System.out.println("value is "+ c);
		return c;
	}
	

	public static void main(String[] args) {
		
		Test1 obj1=new Test1(); //classname refname = new constructor(); //instance level
		
		obj1.add(4,5);//refname.methodname
		
		System.out.println("-------------------");
		
		System.out.println("LAVANYA");
		
		Test2.multiply(4,5);//classname.methodname
	
	}
}
     