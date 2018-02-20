package Constructors;

public class Default {

	int i;
	String sname;
	float flo;
	
	Default()
	{
		System.out.println();
	}
	
	public Default(int a, String name) {
       
		i=a;
		sname=name;

	}

	public Default(int k, String lang, float fl) {
		i=k;
		sname=lang;
		flo=fl;
		
	}

	public static void main(String[] args)
	{
		Default d=new Default();
		
		System.out.println(d.i);
		
		System.out.println(d.sname);
		
		Default d1=new Default(100,"lavanya");
		System.out.println(d1.i);
		
		System.out.println(d1.sname);
		
		Default d3=new Default(103,"lav");
		
        System.out.println(d3.i);
		
		System.out.println(d3.sname);
		
		Default d4=new Default(100,"lavanya",12.1f);
		System.out.println(d4.i);
		
		System.out.println(d4.sname);
		System.out.println(d4.flo);
		
	}
	
}
