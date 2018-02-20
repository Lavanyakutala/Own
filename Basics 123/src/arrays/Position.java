package arrays;

public class Position {

	public static void main(String[] args) {
		
       int[] arr= {12,55,3,5,24,98};
       int max1=arr[0];
       int max2=arr[0];
     
       for(int i=0;i< arr.length;i++)
       {
    	   if(arr[i]>max1)
    	   {
    		
    		   max2=max1;
    		   max1=arr[i];
    		   
    	   }
    	   
    	   
       }
       System.out.println(max2);
	}

}
