package javapractices;

public class NumberSystemPrograms {

	public static void main(String[] args) {
		// This program is for palindrome
		
		// 1234321 == 1234321 121==121 454==454

				int number_4 = 1234321;
				int copy_of_number_4 = number_4;
				int reminder;
				int add = 0;

				while (number_4 > 0) {
					// getting reminder or last digit from given number
					reminder = number_4 % 10;// 1, 2, 1

					//
					add = (add * 10) + reminder;// 1, 12,121

					//
					number_4 = number_4 / 10;// 12, 1, 0

				}

				if (copy_of_number_4 == add) {
					System.out.println("Given number " + copy_of_number_4 + " is palendrom number");
				} else {
					System.out.println("Given number " + copy_of_number_4 + " is not palendrom number");
				}

				System.out.println("##################################################################################");
				
				// This program is for Armstrong
				// 123 = 1*1*1+2*2*2+3*3*3=
				// 153 1+125+27=153

				int number_5 = 153;
				int copy_of_number_5 = number_5;
				int sum = 0;
				int rem;

				while (number_5 > 0) {

					rem = number_5 % 10;
					sum = sum + (rem * rem * rem);
					number_5 = number_5 / 10;

				}

				if (sum == copy_of_number_5) {
					System.out.println("Given number " + copy_of_number_5 + " is armstrong number");
				} else {
					System.out.println("Given number " + copy_of_number_5 + " is not armstrong number");
				}



	}

}
