package day18_ExceptionHandling;

public class AC_Multiple_CatchBlocks {

	public static void main(String[] args) {
		// one single try block can have multiple catch blocks

		System.out.println("Start");
		String s3 = null;

		try {
			System.out.println(s3.length()); // NullPointerException
		} catch (ArithmeticException e) {
			System.out.println("Exception occured with arithmetic calculations");
		} catch (NullPointerException e) {
			System.out.println("Exception occured with null pointer");
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) { // parent for all exception classes
			System.out.println("Something went wrong");

		}
		System.out.println("End");
	}
}
