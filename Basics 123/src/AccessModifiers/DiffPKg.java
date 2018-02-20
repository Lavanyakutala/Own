package AccessModifiers;


import staticPrograms.ProtectedUsageOther;


public class DiffPKg extends PublicAnywhr {

	/*we can access protected methods of any class of another pkg ,only 
	by child class reference only */
								
	// must have parent vhild r/ship other wise we cant
	
	public void op()
	{     
		
		
	}
	
	
	public static void main(String[] args) {
		
		PublicAnywhr kk=new PublicAnywhr();
		kk.diff();
		
		DiffPKg ok=new DiffPKg();
		
	
}
}