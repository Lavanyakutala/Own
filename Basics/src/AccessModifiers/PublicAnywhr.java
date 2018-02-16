package AccessModifiers;

public class PublicAnywhr {  
	
	/*this class accessed by another class in same pkg
	also from other pkg
	*/							
											
	int x=30;									
	int y=17;
	
	public void diff()
	{
		System.out.println("am another pkg of method");
	}
	
	
	public static void main(String[] args)
	{
		
		
		PublicAnywhr j=new PublicAnywhr();
		j.diff();
				
		System.out.println(j.x);
		
	}
	
}
