package arrays;



public class NameSort {
	static String temp;

	public static void main(String[] args) {

		String[] names = new String[4];
		names[0] = "lavany";
		names[1] = "subhas";
		names[2] = "anita";
		names[3] = "nandii";
		
	      //Arrays.sort(names);

					

			// to sort out
	      for (int t = 0;t < names.length; t++) {
				for (int i = 0; i < names.length - 1; i++) {
					if (names[i].compareTo(names[i + 1]) > 0) {
						temp = names[i];
						names[i] = names[i + 1];
						names[i + 1] = temp;

					}
				}

			}
			
			
			
			
			
			
			

			// INSTED OF WRITING AGAIN ND AGAIN GO WITH FOR LOOP
			/*
			 * System.out.println(name[0]); System.out.println(name[1]);
			 * System.out.println(name[2]); System.out.println(name[3]);
			 */

			for (int i = 0; i < names.length; i++) {
				System.out.println(names[i]);

			}

		}

		
		
	}


		
	