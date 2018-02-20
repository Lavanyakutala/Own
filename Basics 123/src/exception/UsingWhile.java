package exception;

import java.util.Scanner;

public class UsingWhile {

static int n,d,result;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  while(true) {
		System.out.println("enter numerator value:");
		n=sc.nextInt();
		
		
		
		System.out.println("enter denominator value:");
      d=sc.nextInt();
    
      
      try {
    	  result=n/d;
    	  System.out.println(result);
    	  
      break;
      }
      catch(ArithmeticException q)
      {
    	  
    	  q.printStackTrace();
    	  
      }
	}
	
	}
		

	}


