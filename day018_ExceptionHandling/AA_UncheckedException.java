package day18_ExceptionHandling;

import java.util.Scanner;

public class AA_UncheckedException {

	public static void main(String[] args) {
		// intentionally making user mistakes (exceptions)

		System.out.println("Program Started...");

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt(); // input 0
		// Exceptions examples
		// Type 1 - Dividing by zero - ArithmeticException
		/*
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero //
		 * exception class name at day18_ExceptionHandling.AA_UncheckedException.main(AA_UncheckedException.java:16)
		 */
		System.out.println(100 / num);

		System.out.println("Program completed");

		// Type 2 - Array Exception - ArrayIndexOutOfBoundsException
		/*
		* Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		* at day18_ExceptionHandling.AA_UncheckedException.main(AA_UncheckedException.java:38)
		*/
		
		int arr[] = new int [5];
		System.out.println("program started again..");
		System.out.println("enter a position to insert into array (0-4):");
		int pos = sc.nextInt(); // input 5
		
		System.out.println("Enter the value to enter into the position:");
		int value = sc.nextInt();
		
		arr[pos]= value;
		
		System.out.println("The value at " + pos + " index is "+ arr[pos]);
		System.out.println("Program completed");
		
		// Type 3 - Format Exception - NumberFormatException
		/*
		* Exception in thread "main" java.lang.NumberFormatException: For input string: "welcome"
		* at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
		* at java.base/java.lang.Integer.parseInt(Integer.java:661)
		* at java.base/java.lang.Integer.parseInt(Integer.java:777)
		* at day18_ExceptionHandling.AA_UncheckedException.main(AA_UncheckedException.java:51)
		*/
		
		String str = "12345";
		int strToNum = Integer.parseInt(str);
		System.out.println(strToNum);
		
		String str2 = "welcome";
		int stringToNumber = Integer.parseInt(str2);
		System.out.println(stringToNumber);
		
		// Type 4 - null pointer - NullPointerException
		String s3 = null; 
		System.out.println(s3.length()); // since the null has undefined value, the length method throws exception
		
		sc.close();
	}

}
