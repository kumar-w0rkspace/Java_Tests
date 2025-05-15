package day18_ExceptionHandling;

public class AE_CheckedExceptions {

	public static void main(String[] args) throws InterruptedException {
		// pausing the execution of a program for 5 seconds
		// Note - normally it will throw exception, but we can handle it
		
		// Type 1
		
		System.out.println("Start");
		System.out.println("Process running");
		
		try {
			Thread.sleep(5000); // pauses the process execution for 5 seconds
		} catch (InterruptedException e) {
			System.out.println("Exception occured");
		} 
		
		System.out.println("Process still running");
		System.out.println("End");
		
		// Type 2
		
		System.out.println("Start");
		System.out.println("Process running");
		
		Thread.sleep(5000); // main method is now throwing InterruptedException
		
		System.out.println("Process still running");
		System.out.println("End");
		
	}

}
