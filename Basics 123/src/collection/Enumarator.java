  package collection;

import java.util.Enumeration;
import java.util.Vector;

public class Enumarator {

	
	//for SET AM WRITING
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> s=new Vector<>();
		for(int i=1;i<=10;i++)
		{
			s.addElement(i);
			
		}
		System.out.println(s);
		
		
		
		Enumeration<Integer> reference=s.elements();
		
		while(reference.hasMoreElements())
		{
			
		Integer i	=reference.nextElement();
		
		if(i%2==0) {
			System.out.println(i);
		}
	
			
		}
		System.out.println(s);
	}
	

}
