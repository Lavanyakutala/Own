package loops;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args)
	{
		int table=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter number for table");
		
		int number=sc.nextInt();
		System.out.println("table given below");
		for(int i=1;i<=10;i++) {
			
			table=number*i;
			System.out.println("table:" +table);
			

		}
	}
}
