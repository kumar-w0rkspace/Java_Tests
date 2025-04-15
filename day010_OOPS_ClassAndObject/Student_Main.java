package day010_OOPS_ClassAndObject;

public class Student_Main {

	public static void main(String[] args) {

		Student sOne = new Student();
		Student sTwo = new Student();

		sOne.sName = "Ronald";
		sOne.sID = 24312;
		sOne.sMarks = 756;
		sOne.sGrade = 'B';
		sOne.display();

		sTwo.sName = "Boleyn";
		sTwo.sID = 34212;
		sTwo.sMarks = 653;
		sTwo.sGrade = 'C';
		sTwo.display();

	}

}
