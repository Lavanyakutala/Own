package Constructors;

public class ThisDot {

	
	
	int i;
	String sname;
	float flo;
	
	ThisDot()
	{
		System.out.println();
	}
	
	public ThisDot(int a, String name) {
       
		this.i=a;
		this.sname=name;

	}

	public ThisDot(int k, String lang, float fl) {
		this.i=k;
		this.sname=lang;
		this.flo=fl;
		
	}

	public static void main(String[] args)
	{
		ThisDot d=new ThisDot();
		
		System.out.println(d.i);
		
		System.out.println(d.sname);
		
		ThisDot d1=new ThisDot(100,"lavanya");
		System.out.println(d1.i);
		
		System.out.println(d1.sname);
		
	/*	this. keyword usage=in arguements am passing same integer,string values rights.to avoid ambiguity am using this. keyword to elimate confusion
		*/
		ThisDot d3=new ThisDot(103,"lav");
		
        System.out.println(d3.i);
		
		System.out.println(d3.sname);
		
		ThisDot d4=new ThisDot(100,"lavanya",12.1f);
		System.out.println(d4.i);
		
		System.out.println(d4.sname);
		System.out.println(d4.flo);
		
	}
	


	
}
