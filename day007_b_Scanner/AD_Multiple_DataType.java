package day007_b_Scanner;

import java.util.Scanner;

public class AD_Multiple_DataType {

	public static void main(String[] args) {
		// enter name, age, grade, marks

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter Age");
		int age = sc.nextInt();
		System.out.println("Enter grade");
		String grade = sc.next();
		System.out.println("Enter Marks");
		double marks = sc.nextDouble();

		System.out.println("Name is " + name);
		System.out.println("Age is " + age);
		System.out.println("Grade is " + grade);
		System.out.println("Marks are " + marks);

		// Inputing random value

		System.out.println("Enter random value");
		Object random = sc.next(); // Note
		sc.close();
		System.out.println("Random value is " + random);

	}

}
