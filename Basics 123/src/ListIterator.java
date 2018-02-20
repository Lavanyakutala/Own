import java.util.ArrayList;

public class ListIterator {

	public static void main(String[] args) {

		ArrayList<Integer> v = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {

			v.add(i);

		}

		System.out.println(v);

		java.util.ListIterator<Integer> ab = v.listIterator();

		while (ab.hasPrevious()) {

			Integer k = ab.previous();

			if(k%2 == 0)

				System.out.println(k);
			/*else
				ab.remove();*/
		}
		System.out.println(v);
	}
}