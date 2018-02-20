package arrays;

import java.util.Arrays;

public class Myown {

	static String temp;

	public static void main(String[] args) {

		String[] name = new String[4];
		name[0] = "lavanya";
		name[1] = "subhash";
		name[2] = "anitha";
		name[3] = "nandini";
		
		
		
		Arrays.sort(name);
		
		
		
		
		
	/*	

		// to sort out
		for (int t = 0; t < name.length; t++) {
			for (int i = 0; i < name.length - 1; i++) {
				if (name[i].compareTo(name[i + 1]) > 0) {
					temp = name[i];
					name[i] = name[i + 1];
					name[i + 1] = temp;

				}
			}

		}*/
		
		
		
		
		
		
		

		// INSTED OF WRITING AGAIN ND AGAIN GO WITH FOR LOOP
		/*
		 * System.out.println(name[0]); System.out.println(name[1]);
		 * System.out.println(name[2]); System.out.println(name[3]);
		 */

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);

		}

	}

	private static int name(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
