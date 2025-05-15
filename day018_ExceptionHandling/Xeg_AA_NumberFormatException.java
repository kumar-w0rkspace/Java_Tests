package day18_ExceptionHandling;

public class Xeg_AA_NumberFormatException {

	public static void main(String[] args) {

		String str = "12345";
		int strToNum = Integer.parseInt(str);
		System.out.println(strToNum);
		
		String str2 = "welcome";
		int stringToNumber = Integer.parseInt(str2); // here at line 12, the program is trying to parse the string to integer number and it throws exception because the string is not number
		System.out.println(stringToNumber);
		
		


	}

}
