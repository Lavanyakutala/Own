package Interface;


interface Main{
	
	public void Clipping(int a);
	int a=10;
}


                         interface Main2{
                        	 
                        	 public void Clipping(int a);
                        	 int a=20;
                         }


 //parameter missing case
/*suppose the interface parameter you dont provide then sys throw error,
so must be as it iss when implementation
*/
// The type SameMethod must implement the inherited abstract method Main2.Clipping(int)



public class SameMethod implements  Main,Main2 {

	public void Clipping(int a)
	{
	   System.out.println("this ths child class");
	   
	   System.out.println(" i am Main method " +Main.a);
	   System.out.println(" i am Main method " +Main2.a);
	}
	
	public static void main(String[] args)
	{
		
		SameMethod obj =new SameMethod();
		obj.Clipping(12);
		
		/*//though i provide value in parameter it never consider, and never throw error,
		bcz intergface variables are final,which we cant change
		*/
	}

	
	
}












