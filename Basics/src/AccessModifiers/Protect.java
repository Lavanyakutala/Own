package AccessModifiers;

 class Protect {

	 
	 protected int a=10;
	 								//access modifiers for outer class=public,<default>
	 								//non access modifiers=final, strict fp, abstract.
	 
	 protected void m1()
	 {
		 
	 System.out.println("fhgfgh");
	 
	 }
	 
	public class g{
	
	public  void main(String[] args) {

		Protect hj=new Protect();
			
		hj.m1();
	}
	}
}
