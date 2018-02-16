package staticPrograms;

public class InstanceStatic {

	
	

	static  int d=10;
	static int h=19;
	
	
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("result:" +c);
	}
	
	public static void del()
	{

		InstanceStatic ok=new InstanceStatic();
		ok.add(6, 8);

	}
	
	
	
	public static void main(String[] args)
	{
		
		InstanceStatic main=new InstanceStatic();
		main.add(2, 4);
		InstanceStatic.del();
		
	}
}
	
	
