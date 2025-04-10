package day007_a_Arrays_Extended;

public class AB_Element_DuplicationCount {

	public static void main(String[] args) {
		// find the total number of times an element is repeated

		int num[] = { 10, 20, 30, 40, 20, 20, 40, 50, 60, 70 };
		int tempCount = 0;
		int findNumber = 20;

/*
		for (int i = 0; i < num.length; i++) {
			if (num[i] == findNumber) {
				tempCount++;
			}
		}
		System.out.println("The element " + findNumber + " is repeated " + tempCount + " times");
*/	
		
		for (int i : num) {
			if (i == findNumber) {
				tempCount++;
			}
		}
		System.out.println("The element " + findNumber + " is repeated " + tempCount + " times");
	}
}