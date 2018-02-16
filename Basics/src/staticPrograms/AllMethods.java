package staticPrograms;

public class AllMethods {
    static int a=10;
    static  int b=20;
      int x=10;
    float y=10.4f;
    
   static void m1() {
    	
    	System.out.println("i am m1 of static");
    	
    }
    
	
	static void m2()
	{
		
	System.out.println(" am m2 of static");
	}
	
	
	
	public void m3(int h,int l)
	{

		int c=h+l;
		
		System.out.println("am m3 of instatnce: "+c);
	}
	
	
	
	public void m4(float t,float e)
	{
		float q=t*e;
		
		System.out.println("am m4 of instance:" +q);
		
		
	}
		

	
	public static void main(String[] args) {
		
		
		AllMethods k=new AllMethods();
		
		AllMethods.m1();
		AllMethods.m2();
		k.m3(5, 6);
		k.m4(10.1f, 1.0f);
		System.out.println(AllMethods.a);    //we cant access directly static variables, if u wanna pribt use sysout
		System.out.println(AllMethods.b);
		
		System.out.println(k.x);
		System.out.println(k.y);
		
	}

}
