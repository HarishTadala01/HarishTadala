package Assignments;

public class SwitchCase {

	public static void main(String[] args) {
		// After clearing UPSC Exam options for Civil Service officer rank

		String Postion = "IAS";

		switch (Postion) {
		case "IAS":
			System.out.println("Congratulation you are an IAS Officer");
			break;

		case "IFS":
			System.out.println("Congratulation you are an IFS Officer");
			break;

		case "IRS":
			System.out.println("Congratulation you are an IRS Officer");
			break;

		case "IPS":
			System.out.println("Congratulation you are an IPS Officer");
			break;

		default:
			System.out.println("You have to take charge as a District Executive officer");
			break;
		}

	}

}
