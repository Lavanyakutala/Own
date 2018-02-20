package Interface;


interface M{
	
	public void Clipping();
	int a=10;
}
                         interface M2{
                        	 
                            public void Clipping();
                        	 int a=20;
                        	 
                         }





public class WithoutParameter  implements  M,M2 {

	public void Clipping()
	{
	   System.out.println("this ths child class");
	   
	   System.out.println(" i am M method " +M.a);
	   System.out.println(" i am M2 method " +M2.a);
	}
	
	public static void main(String[] args)
	{
		
		WithoutParameter obj =new WithoutParameter();
		obj.Clipping();
		
	}

	
	
}














