package day011_OOPS_MethodsAndConstructors;

public class StudentsData {
	String sName;
	int sId;
	char sGrade;

	void printData() {
		System.out.println(sName + " " + sId + " " + sGrade);
	}

	// Type 3 - using constructor -> no return values
	StudentsData(String name, int id, char grade) {
		sName = name;
		sId = id;
		sGrade = grade;
	}

//__________________MAIN METHOD___________________

	public static void main(String[] args) {

		StudentsData stuOne = new StudentsData("Levin", 34, 'B');
		stuOne.printData();

	}

}
