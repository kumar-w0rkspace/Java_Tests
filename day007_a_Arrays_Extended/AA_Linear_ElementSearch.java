package day007_a_Arrays_Extended;

public class AA_Linear_ElementSearch {

	public static void main(String[] args) {
		// check if specific element is present in an array or not
		// element 200

		

		int a[] = { 100, 200, 300, 400, 500 };

		int searchElement = 200;
		boolean status = false; // temp variable
		
		// Basic for loop
		/*
		for (int i = 0; i < a.length; i++) {
			if (a[i] == searchElement) {
				System.out.println("Present");
				status = true;
				break;
			}
		}
		if (status == false) {
			System.out.println("Not Found");
		}
		
		*/
		
		// Enhanced for loop
		
		for (int temp :a) {
			if (temp == searchElement) {
				System.out.println("Element found");
				status = true;
				break;
			}
		}
			if (status == false) {
				System.out.println("Element not Found");
			}
	}

}
