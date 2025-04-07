package day004_Conditional_Control_Statements;

public class AB_If_Else {

	public static void main(String[] args) {
		// the statements inside if should execute if certain conditions are true
		// otherwise, certain other conditions should execute

		// Eg1: If age is above 18, able to vote, else not able to vote
		// Note - Curly braces are optional if there is only one statement

		int person_Age = 16;

		if (person_Age >= 18) {
			System.out.println("Eligible to vote");
		} else {
			System.out.println("Not eligible to vote");
		}

	}

}
