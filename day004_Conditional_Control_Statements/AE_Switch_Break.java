package day004_Conditional_Control_Statements;

public class AE_Switch_Break {

	public static void main(String[] args) {
		// Converting the Eg AE into switch statement
		// Display week names based on week number

		int weekNumber = 8;

		switch (weekNumber) {
		case 1:
			System.out.println(weekNumber + " is Sunday");
			break;
		case 2:
			System.out.println(weekNumber + " is Monday");
			break;
		case 3:
			System.out.println(weekNumber + " is Tuesday");
			break;
		case 4:
			System.out.println(weekNumber + " is Wednesday");
			break;
		case 5:
			System.out.println(weekNumber + " is Thursday");
			break;
		case 6:
			System.out.println(weekNumber + " is Friday");
			break;
		case 7:
			System.out.println(weekNumber + " is Saturday");
			break;

		default:
			System.out.println(weekNumber + " is not a valid week number");
			break;
		}
	}

}
