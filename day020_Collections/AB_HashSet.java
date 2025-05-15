package day20_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AB_HashSet {

	public static void main(String[] args) {

		// Declaration of HashSet
		// heterogenious

		HashSet mySet = new HashSet();
		Set mySet1 = new HashSet();

		// homogenious

		HashSet<String> hashString = new HashSet<String>();
		HashSet<Integer> hashStudent = new HashSet<Integer>();

		// adding values to hashset
		// Note - the data is not preserved in the order we added

		mySet.add(true);
		mySet.add(null);
		mySet.add(false);
		mySet.add("String");
		mySet.add(25);
		mySet.add(20.55);
		mySet.add('D');
		mySet.add(true);
		mySet.add(null);
		mySet.add(false);

		System.out.println(mySet); // randomly showing values avoiding duplicates

		// Removing element
		mySet.remove('D'); // we put direct value to remove since there is no indexing concept
		System.out.println(mySet); // removed D

		// Note - Inserting element, Retrieving value is not possible since there is no
		// proper order

		// Workaround for retrieving value
		// Convert HashSet to ArrayList
		ArrayList myArrayList = new ArrayList(mySet);
		System.out.println(myArrayList);

		System.out.println(myArrayList.get(3));

		// Read all elements using loops
		// Note - not possible by normal forloop since no index

		// For each loop
		for (Object obj : mySet) {
			System.out.println(obj);
		}
		System.out.println("______________"); // space
		// Iterator

		Iterator itr = mySet.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// clearing all values

		mySet.clear();

		System.out.println(mySet.isEmpty() + " " + mySet);

		// size
		System.out.println(mySet.size()); // empty set

	}

}
