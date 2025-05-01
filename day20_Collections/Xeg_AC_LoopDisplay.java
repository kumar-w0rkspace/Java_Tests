package day20_Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Xeg_AC_LoopDisplay {

	public static void main(String[] args) {
		// generate a hashmap and use the multiple display ways

		HashMap<Character, String> myHash = new HashMap<Character, String>();
		// adding
		myHash.put('A', "Apple");
		myHash.put('B', "Box");
		myHash.put('C', "Car");
		myHash.put('D', "Dog");
		myHash.put('E', "Elephant");
		myHash.put('F', "Fan");
		myHash.put('G', "Gold");
		myHash.put('H', "Hippo");
		myHash.put('I', "Insect");
		myHash.put('J', "Jam");

		System.out.println("My hash map = " + myHash);

		// get specific value
		System.out.println("C has value of " + myHash.get('C'));
		// all keys
		System.out.println("The Keys are - " + myHash.keySet());
		// all values
		System.out.println("The values are - " + myHash.values());
		// all
		System.out.println("The keys and values - " + myHash.entrySet());

		// Loop displays
		// enhanced for

		for (char i : myHash.keySet()) {
			System.out.println(i + " " + myHash.get(i));
		}
		System.out.println("______________"); // space
		// Iterator
		Iterator<Entry<Character, String>> itr = myHash.entrySet().iterator();
		while (itr.hasNext()) {
			Entry<Character, String> temp = itr.next();
			System.out.println(temp.getKey() + " " + temp.getValue());
		}

	}

}
