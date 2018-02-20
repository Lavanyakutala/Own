package Interface;

interface New
{
	 public void visible();

	void Clear();
	

}


   class Act implements New 

{
	 public void visible()
	{
		System.out.println(" am looking good");
		
	}
	
	 
	/* \\The type Act must implement the inherited abstract method New.Clear(), if you dont use all methods of Interface in class*/
	 
	/* public void Clear()
		{
			System.out.println(" am looking good");
			
		}
	*/
}

/*all methods of interface must define inside the class when implemented ,other wise it throws error,
   so we cant execute the logic
*/





public class TwoMeth {

	
	
	
	
	
	
	
	
}
