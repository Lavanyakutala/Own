import java.util.ArrayList;
import java.util.ListIterator;

public class Iterator {

	public static void main(String[] args) {
		
		ArrayList<Integer> v=new ArrayList<>();
		for(int i=1;i<=10;i++)
		{
			
		v.add(i);
			
		}
		
		System.out.println(v);
		
		
		ListIterator<Integer> ab=v.listIterator();
		
while(ab.hasNext())
{
	Integer c=ab.next();
	
	if(c%2==0)
		System.out.println(c); 
	else
		ab.remove();
	
}
		
		System.out.println(v);
		
		
		

	}

}
