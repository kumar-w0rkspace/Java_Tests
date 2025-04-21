package day014_OOPS_Inheritance;

class Months {
	int days;

	void showMonths() {
		System.out.println("Class Months: " + days + " days");
	}
}

class January extends Months {
	int dateJan;

	void showJanuary() {
		System.out.println("Class January: " + dateJan + " days");
	}
}

class February extends Months {
	int dateFeb;

	void showFeb() {
		System.out.println("Class February: " + dateFeb + " days");
	}
}

class March extends Months {
	int dateMar;

	void showMar() {
		System.out.println("Class March: " + dateMar + " days");
	}

}

public class AC_Hierarchy_Inheritance {

	public static void main(String[] args) {

		// Months class
		Months myMonths = new Months();
		myMonths.days = 365;
		System.out.println(myMonths.days); // Months class
		myMonths.showMonths(); // Months class

		// January class
		January myJan = new January();
		myJan.dateJan = 31;
		myJan.days = 3131;
		System.out.println(myJan.dateJan);
		myJan.showJanuary(); // January class
		System.out.println(myJan.days);
		myJan.showMonths(); // Months class in January object

		// February class
		February myFeb = new February();
		myFeb.dateFeb = 28;
		myFeb.days = 2829;
		System.out.println(myFeb.dateFeb);
		myFeb.showFeb(); // February class
		System.out.println(myFeb.days);
		myFeb.showMonths(); // Months class in February object

		// March class
		March myMar = new March();
		myMar.dateMar = 31;
		myMar.days = 313131;
		System.out.println(myMar.dateMar);
		myMar.showMar(); // March class
		System.out.println(myMar.days);
		myMar.showMonths(); // Months class in March object

	}

}
