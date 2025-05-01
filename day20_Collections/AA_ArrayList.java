package day20_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee {

}

public class AA_ArrayList {

	public static void main(String[] args) {
		// Declaring hetrogenious arraylist
		// can hold any type of data
		ArrayList myListOne = new ArrayList();
		List myListTwo = new ArrayList();

		// Declaring Homogenious Arraylist
		// can hold single type of data while using wrapper class
		ArrayList<Integer> myIntList = new ArrayList<Integer>(); // Integer
		ArrayList<String> myStrList = new ArrayList<String>(); // String
		ArrayList<Employee> myEmpList = new ArrayList<Employee>(); // Employee

		// Adding data - one by one -> dynamically increasing
		myListOne.add(250);
		myListOne.add("Index range");
		myListOne.add(10.22);
		myListOne.add(true);
		myListOne.add(null);
		myListOne.add(250);
		myListOne.add(null);

		// size
		System.out.println(myListOne.size()); // size of arraylist

		// printing data from arraylist
		System.out.println(myListOne);

		// removing one element
		myListOne.remove(1); // pass the index to remove
		System.out.println(myListOne);

		// inserting data inside the arraylist (overloaded add)

		myListOne.add(4, 'A'); // give index then value to add
		System.out.println(myListOne);

		// change / modify the value
		myListOne.set(1, 100.1); // give index and then value to replace
		System.out.println(myListOne);

		// extracting specific element or object
		System.out.println(myListOne.get(3));

		// reading all values from arraylist - (Iterator)
		// Type 1 - normal for loop

		for (int i = 0; i < myListOne.size(); i++) {
			System.out.println(myListOne.get(i));
		}

		// Type 2 - enhanced for loop[

		for (Object temp : myListOne) { // since myListOne is hetrogenious
			System.out.println(temp);
		}
		System.out.println();
		// Type 3 - Iterator (Only for collections)

		Iterator itr = myListOne.iterator(); // using while loop since there is no count

		while (itr.hasNext()) { // hasNext checks if there is data or not. they dont follow index
			System.out.println(itr.next()); // get the exact value from list
		}

		// Checking if arraylist is empty or not
		System.out.println(myListOne.isEmpty());

		// removing all data from arraylist
//		myListOne.clear();
//		System.out.println(myListOne); // empty array
//		
		// removing selected data randomly
		ArrayList myRemoveList = new ArrayList();

		myRemoveList.add(250);
		myRemoveList.add('A');

		myListOne.removeAll(myRemoveList);
		System.out.println(myListOne);

		// Is Empty?
		System.out.println("Is my ArrayList Empty? :" + myListOne.isEmpty());

	}

}
