package inheritance;

 class AllinOne {

	
	
	 void m1()
	
	
	
	{
		System.out.println("am first method  of class A");
	}
	

     void m2()
	
	
	
	{
		System.out.println("am second method  of class A");
	}
	
      void m3()



{
	System.out.println("am third method  of class A");
}

 	class B extends AllinOne{
		
		
		
		void m4()
		
		
		
		{
			System.out.println("hgfhg");
		}
		
		 void m5()



		{
			System.out.println("am first method  of class B");
		}
		
		 
		   void m3()



		 {
		 	System.out.println("am third method  of class A");
		 }

		
		 
		
		class C extends B{
			
			
			void m7()
			
			
			
			{
				System.out.println("opoo");
			}
			
			
			
			 void m8()



			{
				System.out.println("am second method  of class c");
			}
			
			   void m3()



			   {
			   	System.out.println("am third method  of class A");
			   }

		
	public class FInally{		

	public   void main(String[] args){
		AllinOne z=new AllinOne();
		z.m1();
		z.m2();
		z.m2();
		z.m3();
		

		}
	}	

	}}}