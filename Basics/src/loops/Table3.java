package loops;
import java.util.Scanner;
public class Table3 {

int i,j;
		
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter number:");
			int n=sc.nextInt();
			for(int i=1;i<=10;i++) {
				
				//System.out.println(n+"*"+i+"="+n*i);
				
			//}
				for(int j=1;j<=i;j++)
			
			System.out.println(i+"*"+j+"="+(i*j));
			
		//	System.out.println(n+"*"+i+"="+n*i);
			
			}
		}
	}


