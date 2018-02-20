package operators;

public class LogicalOperators {

	
	public static void main(String[] args)
	{
		
		int firstfloor=10;
		int fifthfloor=15;
		
            		
		/*if(firstfloor>12 && fifthfloor<4)	           // logical AND &&  
		{
			System.out.println("sorry ,first floor is not Greater");
			
		}
		else {
			
	    System.out.println("statement is wrong"); */
	    
	    
		if(firstfloor>11 || fifthfloor>4)	           // logical OR ||
		{
			System.out.println("EITHER OF ONE EXPRESSION IS TRUE");
			
		}
		else {
			
	    System.out.println("statement is wrong");
	    
	    
		}
		
		int number=3;
		 
		if((number % 2==0)  && 	(number % 3==0) )          // logical OR ||
		{
			System.out.println("this num divisible by both 2 and 3");
			
		}
		else {
			
	    System.out.println("this num not divisible by both 2 and 3");
	    
	    
		} 
		
		if((number % 2==0)  || 	(number % 3==0) )          // logical OR ||
		{
			System.out.println("this num divisible by 2 or 3");
			
		}
		else {
			
	    System.out.println("this num not divisible by  2 and 3");
	    
	    
		} 
		
		if((number % 2==0) ^ (number % 3==0) )    // logical OR ||
		
		{
			
			System.out.println("this num divisible by  2 0r 3 but not both ");
			
		
	    
		} 
		
		}
		
		
		
	}
	









			
/*		
				
	if(firstfloor>12 && fifthfloor<4)	
		{
		System.out.println("sorry ,first floor is not Greater");
		
	}
	else {
		
    System.out.println("statement is wrong");
    
	}
		
		
		
		
		
		
	}
}

*/