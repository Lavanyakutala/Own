package Interface;

interface A{
	public void show();
}

 
	
 class Interj implements A
	
	 {
		 void display()
		 {
		System.out.println("hello");
		 }
		public void show()
		 {
		System.out.println("hlo");
		 }
		 
	 }
		
		
		
	public class 	InterF{
	public static void main(String[] args)
	{
		Interj ok=new Interj(); //this is 1method
		ok.show();
		ok.display();
		//now i want to see only parent method only
		
		A obj1=new Interj();
		obj1.show();
		
	}
		
		
	/*	 
	 in inheritance
	A obj=new B();
	child B properties comes
	 
	
		in interface
		A obj=new B();
	parent A properties comes
	 */
		
		
		
		
		
		
		
		
		
	}
	