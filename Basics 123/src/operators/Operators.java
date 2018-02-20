package operators;


public class Operators

{ 
	int a=12,b=30;
  
 public void operation(int a, int b)
 
  {
	  int c=a+b;
	  System.out.println("addition of num :" +c);
  }
 
	
  public void sub(int a, int b)
  
  {
	  int c=a-b;
	  System.out.println("substraction of num:" +c);
	
  }
  
  public void multy(int a, int b)
  {
	 
	  int c=a*b;
	  
	  System.out.println("multiplication of num:" +c);

	 
  }
  public void div(int a, int b)
  {
	 
	  int c=a/b;
	  
	  System.out.println("division of num:" +c);
	
	
  }
  public void divid(int a, int b)
  {
	 
	  int c=a%b;
	  
	  System.out.println("division of num:" +c);
	
	
  }
  
  
	public static void main(String[] args)
	
	{
		 Operators op=new Operators();
		 op.operation(3,6);
		 op.sub(4,6);
		 op.multy(5, 6);
		 op.div(10,2);
		 op.divid(10,2);
		 
	}
	

}
	
			
	


