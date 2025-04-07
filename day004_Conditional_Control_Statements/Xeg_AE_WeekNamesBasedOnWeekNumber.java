package day004_Conditional_Control_Statements;

public class Xeg_AE_WeekNamesBasedOnWeekNumber {

	public static void main(String[] args) {
		// Display week names based on week number

		int weekNumber = 9;
		if (weekNumber == 1) {
			System.out.println(weekNumber + " is Sunday");
		} else if (weekNumber == 2) {
			System.out.println(weekNumber + " is Monday");
		} else if (weekNumber == 3) {
			System.out.println(weekNumber + " is Tuesday");
		} else if (weekNumber == 4) {
			System.out.println(weekNumber + " is Wednesday");
		} else if (weekNumber == 5) {
			System.out.println(weekNumber + " is Thursday");
		} else if (weekNumber == 6) {
			System.out.println(weekNumber + " is Friday");
		} else if (weekNumber == 7) {
			System.out.println(weekNumber + " is Saturday");
		} else {
			System.out.println(weekNumber + " is invalid Week Number");

		}
	}
}
