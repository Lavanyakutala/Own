package loops;

public class Palindrome {
	
	
	public static void main(String[] args) {
		
		int n=151;
		int r,sum=0,temp;
		
		temp=n;                        
		
		while(n>0)
		
		{									
			r=n%10;							
											
			sum=(sum*10)+r;					
			
			n=n/10;							
			
		}
		
		
		if(temp==sum)
			System.out.println("palindrome");
		
	}
	

}


/*
int n=151;
int r,sum=0,temp;

temp=n;                        //temp=151

while(n>0)

{									
	r=n%10;							
					





	sum=(sum*10)+r;						
	
	n=n/10;						


r=151/10=1
sum=0*10+1=1
n=151/10=15


r=15%10=5 ,sum=1*10+5=15
n=15/10=1;



r=1%10=1
sum=15*10+1=151

*/
