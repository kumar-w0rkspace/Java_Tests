package day004_Conditional_Control_Statements;

public class AC_If_Else_If {

	public static void main(String[] args) {
		// If else ladder
		// the statements inside if should execute if certain conditions are true
		// otherwise, certain other conditions should execute till the requirement is satisfied
		
		// Eg1: Check if the gender is male female or others
		
		String theGender = "Tree";
		if (theGender == "Male") {
			System.out.println("The Gender of person is Male");
		} else if (theGender == "Female") {
			System.out.println("The Gender of person is Female");
		} else {
			System.out.println("The Gender is Others");
		}

	}

}
