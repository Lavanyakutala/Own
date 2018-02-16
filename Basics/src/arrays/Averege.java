package arrays;
public class Averege {

	
	
	public static void main(String[] args)
	{
		int i;
		int sum=0;
		int avg=0;
		
		int average[]={10,12,18,17};
		
		for( i=0;i<average.length;i++)
		{
			
			sum=sum+average[i];
			

			avg=sum/average.length;
			
			
		}
		
		
		System.out.println("average:"   +avg);
	}
	
	
	
	
	
	
}
