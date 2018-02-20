package Interface;


interface Main{
	
	public void Clipping();
	
}


                         interface Low{
                        	 
                        	public void Cluch();
                        	 
                         }



/*
 class Joins implements Main,Low
{
	public void Clipping()
	{
		System.out.println("hi am clipping");
		
	}
	
	public void Cluch()
	{
		System.out.println("hi am cluching");
		
	}
	

}*/






public class TwointTwometh implements  Main,Low {

	
	
	public void Clipping()
	{
		System.out.println("hi am clipping");
		
	}
	
	public void Cluch()
	{
		System.out.println("hi am cluching");
		
	}
	public static void main(String[] args) {
		
		
		TwointTwometh obj=new TwointTwometh();
		obj.Clipping();

		obj.Cluch();
	}

}
