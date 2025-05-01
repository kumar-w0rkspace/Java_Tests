package day20_Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class Xeg_AB_HashSet_To_ArrayList {

	public static void main(String[] args) {
		// a random hashset and add, remove, and read whole values
		
		HashSet<Object> myHashSet = new HashSet<>();
		// adding
		myHashSet.add("String");
		myHashSet.add(123);
		myHashSet.add(200.239);
		myHashSet.add(false);
		myHashSet.add(true);
		myHashSet.add(false);
		myHashSet.add(true);
		myHashSet.add('O');
		
		System.out.println(myHashSet);
		
		// removing
		
		myHashSet.remove(false);
		System.out.println(myHashSet);
		
		// Retrieving value
		// Note - there is no get method and no index for hashset, so we can convert the whole hashset to arraylist and get index
		
		// converting
		
		ArrayList arr = new ArrayList(myHashSet);
		System.out.println(arr.size());
		// retrieving the value at specific index
		System.out.println(arr.get(2));
		
		
		
		
	}

}
