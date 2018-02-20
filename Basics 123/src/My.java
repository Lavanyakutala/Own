import java.util.ArrayList;
import java.util.Iterator;

public class My {

	
	
	public static void main(String[] args)
	{
	
	ArrayList<Integer> j=new ArrayList<>();
	
	for(int i=1;i<=10;i++)
	{
		j.add(i);
	
	}
		
	System.out.println(j);
	
	
	Iterator<Integer> ref=j.iterator();
	while(ref.hasNext())
	{
	Integer r=ref.next();
	if(r%2==0)
		System.out.println(r);
	else
		ref.remove();
	}

	
System.out.println(j);
	}
	
	
	
}
