package staticPrograms;

import AccessModifiers.PublicAnywhr;


public class AllMethod  extends PublicAnywhr{

	static  double mul(double a, double b)
	{
		double c=a*b;
		System.out.println("result: "+c);
		return c;
	}
	
	
	
	public void del()
	{
		System.out.println("am instance method");
		
	}
	
	public static void main(String[] args) {
		PublicAnywhr yey=new PublicAnywhr();
		yey.diff();
		
		
		AllMethod lol=new AllMethod();
		AllMethod.mul(12.2, 1.1);
		lol.del();
		System.out.println(mul(45.6,77.8));
		
		System.out.println(lol.mul(5.4,67.7));
		
		
		
		
		
		
		
	}

}
