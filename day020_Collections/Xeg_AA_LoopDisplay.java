package day20_Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Xeg_AA_LoopDisplay {

	public static void main(String[] args) {
		// example using iterator
		// Note - All collections can use iterator method

		ArrayList<Object> myArrayList = new ArrayList<Object>();

		myArrayList.add("shawn");
		myArrayList.add('K');
		myArrayList.add(true);
		myArrayList.add(123223);
		myArrayList.add(null);
		myArrayList.add(20.89);
		myArrayList.add(3456783456L);

		System.out.println(myArrayList);

		// simple for loop
		for (int i = 0; i < myArrayList.size(); i++)
			System.out.println(myArrayList.get(i));
		System.out.println("_______________"); // space
		// enhanced for loop
		for (Object obj : myArrayList) {
			System.out.println(obj);
		}
		System.out.println("_______________"); // space
		// iterator
		Iterator<Object> itr = myArrayList.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
