package collection;

import java.util.ArrayList;


public class New {

	public static void main(String[] args) {
		
		ArrayList<Integer> ref =new ArrayList<>();
		ref.add(10);
		ref.add(100);
		ref.add(45);
		ref.add(87);
		System.out.println("result:" +ref);
		
		
		ref.add(77);
		
		System.out.println("result:" +ref);
		
	/*	ref.clear();
		System.out.println("result:" +ref);*/
		
		
		/*System.out.println(ref.size());         //to know size
		System.out.println(ref.indexOf(100));  // to know index of element
*/		
		
		ArrayList<Integer> copy=(ArrayList<Integer>)ref.clone();
		System.out.println("contains:  "+ref.contains(100));
		
		//System.out.println("contains:  "+ref.containsAll(copy));  //contains all
		System.out.println("all:  "+ref.get(4));   //index mention with indexnum
		
		
	}

}
