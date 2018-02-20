package loops;

public class ArmStrong {
                
	public static void main(String[] args) {
		
  int n=153;
  int temp=n;  //using some operations on n,so we are taking temp
  int r,sum=0;
  
  while(n>0)
  {
		r=n%10;
		n=n/10;
		sum=sum+ r*r*r;
		
	}

  if(temp==sum)
		  System.out.println("armstrong");
	}
}
