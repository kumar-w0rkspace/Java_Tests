package day010_OOPS_ClassAndObject;

public class Employee {

	// Variables
	String eName;
	int eID;
	String eJob;
	int eSal;

	// Methods
	void display() { // void returns nothing
		System.out.println(eName);
		System.out.println(eID);
		System.out.println(eJob);
		System.out.println(eSal);
	}
/* New class
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
*/
}
