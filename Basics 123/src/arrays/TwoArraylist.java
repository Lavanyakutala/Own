package arrays;

import java.util.Arrays;

public class TwoArraylist {
	
	static int temp;
	static String tempsr;
	public static void main(String[] args)
	{

	String[] stok = new String[3];
	int [] marks = new int[4];

	stok[0]="lucky";stok[1]="pikky";stok[2]="shokky";
	marks[0]=12;marks[1]=10;marks[2]=122;marks[3]=123;
	
	 Arrays.sort(stok);
	 
	 Arrays.sort(stok);
	 Arrays.sort(marks);
	/*// to sort out
  for (int t = 0;t < stok.length; t++) {
		for (int i = 0; i < stok.length - 1; i++) {
			if (stok[i].compareTo(stok[i + 1]) > 0) {
				tempsr = stok[i];
				temp=marks[i];
				
				stok[i] = stok[i + 1];
				marks[i]=marks[i+1];
				
				stok[i + 1] = tempsr;
				marks[i+1]=temp;
			}
		}
  }

*/
	for(int i=0;i<stok.length;i++)
	{
	
	
	System.out.printf("%-10s %s \n", stok[i],marks[i]);
	
}
}

}
