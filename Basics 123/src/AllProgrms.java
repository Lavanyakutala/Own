import java.util.Enumeration;
import java.util.Vector;

import com.gargoylesoftware.htmlunit.javascript.host.html.Enumerator;

public class AllProgrms {

	public static void main(String[] args) {
	
		//used for legacy systems,this pgm for SET in collection
		
		Vector<Integer> r=new Vector<>();
		
		for(int i=1;i<=10;i++)
		{
			
			r.addElement(i);
			//System.out.println("adding elements: " +i);
			System.out.println(r);
			
			
	Enumeration<Integer>	ref=r.elements();
	
			while(ref.hasMoreElements())
			{
				
			Integer u=	ref.nextElement();
			if(u%2==0)
			
				System.out.println(u);
			}
			System.out.println(r);
		}

	}

}


   
   
   
   
   
   