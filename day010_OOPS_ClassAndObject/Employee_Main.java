package day010_OOPS_ClassAndObject;

public class Employee_Main {

	public static void main(String[] args) {

		// Making an object from Employee class
		Employee empOne = new Employee();
		empOne.eName = "James";
		empOne.eID = 203;
		empOne.eJob = "Associate";
		empOne.eSal = 35_500;
		empOne.display();

		System.out.println("_____"); // Space

		// Making another object with different data
		Employee empTwo = new Employee();
		empTwo.eName = "Noah";
		empTwo.eID = 407;
		empTwo.eJob = "Development Manager";
		empTwo.eSal = 75_000;
		empTwo.display();

	}

}
