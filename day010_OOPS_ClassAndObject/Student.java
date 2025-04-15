package day010_OOPS_ClassAndObject;

public class Student {

	String sName;
	int sID;
	int sMarks;
	char sGrade;
	String sSchool = "BNEHS";

	void display() {
		System.out.println(sName + " " + sID + " " + sMarks + " " + sGrade + " " + sSchool);

	}
}
