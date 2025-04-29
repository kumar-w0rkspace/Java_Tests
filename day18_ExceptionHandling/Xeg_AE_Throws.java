package day18_ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Xeg_AE_Throws {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		// handling checked exception via throws keyword

		System.out.println("hi");

		Thread.sleep(5000);

		System.out.println("bye");

		FileInputStream file = new FileInputStream("C:\\file.name");
		System.out.println("FileNotFoundException added to main method");
		System.out.println("done");

	}

}
