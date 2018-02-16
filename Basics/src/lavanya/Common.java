package lavanya;



public class Common {
	


 //int lenth; int width;
		public int feature(int length, int width)
		{
			int Area=length*width;
			System.out.println("Result:"+Area);
			return Area;
		}
	                                            
	    public static void main(String[] args) 
	    {
		Common co=new Common();
		co.feature(23,33);
		
		
		double MoonGravity=0.787f;
		double Weight=100;// weight on earth
		double newweight= Weight* MoonGravity; //calculate weight in moon
		System.out.println("your weight on moon:" +newweight);
		System.out.println("@   @");
		System.out.println("  ^");
		System.out.println("******");
				
	    }


}