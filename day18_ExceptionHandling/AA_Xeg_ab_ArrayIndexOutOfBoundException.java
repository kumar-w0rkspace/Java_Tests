package day18_ExceptionHandling;

import java.util.Scanner;

public class AA_Xeg_ab_ArrayIndexOutOfBoundException {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int [5];
		System.out.println("program started again..");
		System.out.println("enter a position to insert into array (0-4):");
		int pos = sc.nextInt(); // input 5
		
		System.out.println("Enter the value to enter into the position:");
		int value = sc.nextInt();
		
		arr[pos]= value; // here we get ArrayIndexOutOfBoundsException at line 18 because the program is trying to put the value into the 5th index which does not exist
		
		System.out.println("The value at " + pos + " index is "+ arr[pos]);
		
		System.out.println("Program completed");
		
		
		sc.close();

	}

}
