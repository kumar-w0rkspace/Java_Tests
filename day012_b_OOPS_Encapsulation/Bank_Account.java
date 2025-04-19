package day012_b_OOPS_Encapsulation;

public class Bank_Account {
	// this keyword is used to refer to the class variable
	// Note - private keyword is used to secure data
	// to access the private keyword, we need to make setters and getters method

	private String acName;
	private int acNo;
	private double acAmount;
	char acTier;
	String bankName = "ABCD Bank";

	String getAcName() {
		return acName;
	}

	void setAcName(String acName) {
		this.acName = acName;
	}

	int getAcNo() {
		return acNo;
	}

	void setAcNo(int acNo) {
		this.acNo = acNo;
	}

	double getAcAmount() {
		return acAmount;
	}

	void setAcAmount(double acAmount) {
		this.acAmount = acAmount;
	}

//__________________MAIN METHOD_________________

	public static void main(String[] args) {

		Bank_Account userOne = new Bank_Account();
		userOne.setAcName("Lorenz"); // encapsulated
		userOne.setAcNo(346344565); // encapsulated
		userOne.setAcAmount(56000.50); // encapsulated
		userOne.acTier = 'D'; // Not encapsulated

		System.out.println("Name: " + userOne.getAcName());
		System.out.println("Account Number: " + userOne.getAcNo());
		System.out.println("Acount Amount: " + userOne.getAcAmount());
		System.out.println("User Tier: " + userOne.acTier);
		System.out.println("User Bank is: " + userOne.bankName); // Hard coded at class level

//		userOne.acAmount; --> can't access because its private
	}

}
