package day011_OOPS_MethodsAndConstructors;

public class Student {
	// Storing data into variables

	// Type 1
	String sName; // class variables
	int sID;
	char sGrade;

	void printStudentData() {
		System.out.println(sName + " " + sID + " " + sGrade);
	}

	// Type 2
	void setData(String name, int id, char grade) { // local variable
		sID = id;
		sName = name;
		sGrade = grade;
	}

//	// Type 3 - using constructor -> no return values
//	Student(String name, int id, char grade) {
//		sID = id;
//		sName = name;
//		sGrade = grade;
//	}

//__________________MAIN METHOD___________________	

	public static void main(String[] args) {

		// Type 1 - object reference variable
		Student sOne = new Student();

		sOne.sName = "Luke";
		sOne.sID = 54;
		sOne.sGrade = 'B';
		sOne.printStudentData();

		// Type 2 - method specific variable
		Student sTwo = new Student();
		sTwo.setData("Nike", 23, 'C');
		sTwo.printStudentData();

	}

}
