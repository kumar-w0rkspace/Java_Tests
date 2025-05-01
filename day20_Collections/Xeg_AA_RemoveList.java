package day20_Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Xeg_AA_RemoveList {

	public static void main(String[] args) {
		// using another arraylist, remove the second one from the main

		ArrayList<String> myArrayList = new ArrayList<>();

		ArrayList<String> myRemoveList = new ArrayList<>();

		myArrayList.add("This ");
		myArrayList.add(" is a program ");
		myArrayList.add(" --TO BE REMOVED-- "); // <--- line to be removed
		myArrayList.add(" defined to ");
		myArrayList.add(" learn about arraylist. ");
		myArrayList.add(" Objectieve is to ");
		myArrayList.add(" remove an arraylist of ");
		myArrayList.add(" --TO BE REMOVED-- "); // <--- line to be removed
		myArrayList.add(" data from the ");
		myArrayList.add(" myRemoveList ");
		myArrayList.add(" and display ");
		myArrayList.add(" rest of the ");
		myArrayList.add(" --TO BE REMOVED-- "); // <--- line to be removed
		myArrayList.add(" items in list");

		System.out.println("My String ArrayList is : " + myArrayList);

		myRemoveList.add(myArrayList.get(2)); // index number of the lines to be removed on myArrayList
		myRemoveList.add(myArrayList.get(7));
		myRemoveList.add(myArrayList.get(12));

		System.out.println("My String ArrayList to remove is : " + myRemoveList);

		myArrayList.removeAll(myRemoveList); // removing the remove list from main array
		System.out.println(myArrayList);

		Iterator<String> myItr = myArrayList.iterator();

		while (myItr.hasNext()) {
			System.out.println(myItr.next());
		}

	}

}
