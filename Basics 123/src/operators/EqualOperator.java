package operators;

public class EqualOperator
{

	public String name;
	
	
public static void main(String[] args)
  {
	EqualOperator go=new EqualOperator(); /* we can have no of obj ref to a single class obj*/
	EqualOperator gone=new EqualOperator(); 
	
		go.name= "lavanya";
	    gone.name="language";
	
     // if(go.name==gone.name)   // to check whether equal
    	if (go.name!=gone.name)  // to check whether not equal
       
      {
       System.out.println("yes the names are equal");
      }
      
      else {
    	  
        System.out.println("No, they aren't same.");
      }
}}
	
   // (or) 
// on checking of 2 numbers whether  equal or not

 /*   int x=10;
	int y=20;
	if (x==y)
	{
	System.out.println("yes the values are equal");
	} 
	else
	{
	
	System.out.println("no, the values are not");
	}

 }*/

