package collection;

import java.util.ArrayList;

public class Iterator {

	public static void main(String[] args) {
	
  ArrayList<String> arr=new ArrayList<>();
 arr.add("kio");
 arr.add("ooo");
 arr.add("pppio");
 System.out.println(arr);
 
  java.util.Iterator<String> str=arr.iterator();
  
    while(str.hasNext())
    {
    	
    	System.out.println(str.next());
    }
    
  /*for(int i=1;i<=10;i++)
  {
	  
	  
	  
  }
  */
	}

}
