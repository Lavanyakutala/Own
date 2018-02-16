package inheritance;

 class One {


	public void  timings()
	{
		
	 int starttime=8;
	 int endtime=9;
	 System.out.println(" starting time:" +starttime);
	 System.out.println(" ending time:" +endtime);

		
	}
	
	public void Interview()
	{
		
		int a=2;
		System.out.println("interview timing" +a);
		
		
	}
	
	public void Course()
	{
		
		String a=" java";
		String b=" selenium";
		String v=" .net";
		
		
		System.out.println("only java class runs here" +a);
		
		System.out.println("only selenium class runs here" +b);
		
		
		System.out.println("only .net class runs here" +v);
	}
		
		
 }
	
	
	public class Over extends One {
		
	
		public void  timingss()
		{
			
		 int starttime=10;
		 int endtime=18;
		 System.out.println(" starting time:" +starttime);
		 System.out.println(" ending time:" +endtime);
		}
	
		public void Course()
		{
			
			String a=" java";
			String b=" selenium";
			String v=" sql";
			
			
			System.out.println("only java class runs here" +a);
			
			System.out.println("only selenium class runs here" +b);
			
			
			System.out.println("only .net class runs here" +v);
			
		}
	
	public static void main(String[] args) {
		Over ov=new Over();
		ov.Course();
		ov.timingss();
		
	}
		
	}
		
	
	
	

