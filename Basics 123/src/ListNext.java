import java.util.ArrayList;


public class ListNext {

	public static void main(String[] args) {

		ArrayList<Integer> v = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {

			v.add(i);

		}

		System.out.println(v);

		java.util.ListIterator<Integer> ab = v.listIterator();

		while (ab.hasNext())
			
				 {

			Integer k = ab.next();

			/*if(k%2 == 0)

				System.out.println(k);
			else
				ab.remove();
		*/
			
			if(k.equals(3))
				ab.set(99);
			
		}
		System.out.println(v);
	}

}
