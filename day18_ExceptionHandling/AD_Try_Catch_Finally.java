package day18_ExceptionHandling;

public class AD_Try_Catch_Finally {

	public static void main(String[] args) {
		// working with finally block
		// Note - finally block will execute regardless if there is exception or not

		System.out.println("Start");
		String s = null;

		try {
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("Handled exception with catch block");
		} finally {
			System.out.println("Entered into finally block");
		}
		System.out.println("End");
	}

}
