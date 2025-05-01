package day20_Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class AC_HashMap {

	public static void main(String[] args) {
		// HashMap - Key value pair
		// eg - country name (key) and their capital (Values)
		// Declaration

		HashMap<Object, String> hmOne = new HashMap<Object, String>();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		Map<Double, Float> mm = new HashMap<Double, Float>();

		HashMap<Integer, String> myHash = new HashMap<Integer, String>();

		// adding pairs
		myHash.put(101, "Jambo"); // Key is unique
		myHash.put(102, "Dumbo");
		myHash.put(103, "Gumbo");
		myHash.put(104, "Jimbo");
		myHash.put(105, "Gumbo");
		myHash.put(106, "Roderick");

		System.out.println("Full map = " + myHash);
		// Size
		System.out.println("Size of map = " + myHash.size());
		// Removing pair
		myHash.remove(104);
		System.out.println("Full map after removing a pair = " + myHash);
		// Access value of a key
		System.out.println(myHash.get(105));
		// accessing all the keys
		System.out.println("The keys are " + myHash.keySet());
		// accessing all the values
		System.out.println("The values are " + myHash.values());
		// keys along with values
		System.out.println(myHash.entrySet());

		// looping using for each
		for (int i : myHash.keySet()) { // myHash.keySet will return us the key
			System.out.println(i + " " + myHash.get(i)); // use the key to find the value of that key
		}
		System.out.println("_____________________"); // space
		// using Iterator

		Iterator<Entry<Integer, String>> itr = myHash.entrySet().iterator();

		while (itr.hasNext()) {
			Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		// clearing hashmap
		myHash.clear();
		System.out.println(myHash.isEmpty());

	}

}
