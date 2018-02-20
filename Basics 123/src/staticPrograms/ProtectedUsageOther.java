package staticPrograms;

public class ProtectedUsageOther {

	

		 
		 protected int a=10;
		 								//access modifiers for outer class=public,<default>
		 								//non access modifiers=final, strict fp, abstract.
		 
		 protected void m1()
		 {
			 
		 System.out.println("fhgfgh");
		 
		 }
		 
		 public static void main(String[] args)
		 
		 {
			 ProtectedUsageOther od=new ProtectedUsageOther();
			 od.m1();
			 
			 
		 }
	
}
