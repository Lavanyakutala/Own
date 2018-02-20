package arrays;

public class MaxNum {

	public static void main(String[] args) {

			
	       int[] arr= {12,55,3,5,24,98};
	       int min=arr[0];
	       for(int i=0;i< arr.length;i++)
	       {
	    	   if(arr[i]<min)
	    	   {
	    		   
	    		   min=arr[i];
	    		   
	    	   }
	    	   
	    	   
	       }
	       System.out.println(min);
		


	}

}
