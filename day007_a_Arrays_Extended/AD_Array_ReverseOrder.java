package day007_a_Arrays_Extended;

public class AD_Array_ReverseOrder {

	public static void main(String[] args) {
		// Reverse an array
		// Note - can be done using classic for loop only

		int nums[] = { 234, 436, 568, 234, 2, 12, 34, 46, 34 };

		for (int i = nums.length - 1; i >= 0; i--) { // nums.length = size of array (9) but to get index, we need to use
														// nums.length-1
			System.out.println(nums[i]);
		}

	}

}
