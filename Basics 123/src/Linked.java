import java.util.LinkedList;
import java.util.ListIterator;

public class Linked {

	public static void main(String[] args) {
	
LinkedList<String> s=new LinkedList<>();
s.add("lavanya");
s.add("nandu");
s.add("subha");
s.add("lucky");	
		
System.out.println(s);

ListIterator<String> g= s.listIterator();
while(g.hasNext())
{
	String f=g.next();
	if(f.equals("lavanya"))
	 s.set(0, null);
		
}
System.out.println(s);
	}

}
