package Assignments;

public class Asc_desNos {

	public static void main(String[] args) {

		//Printing 1 to 100 using for loop
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}

		System.out.println("###########################");

		//Printing 100 to 1 using for loop
		for (int i = 100; i >= 1; i--) {
			System.out.println(i);
		}

		System.out.println("###########################");

		//Printing 1 to 100 using while loop
		int number = 1;
		while (number <= 100) {
			System.out.println(number);
			number++;
		}

		System.out.println("##############################");

		//Printing 100 to 1 using while loop
		int digit = 100;
		while (digit >= 1) {
			System.out.println(digit);
			digit--;
		}

	}

}
