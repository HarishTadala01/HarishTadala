package Assignments;

public class MultiplicationTable_whileloop {

	public static void main(String[] args) {
		// Multiplication table from 2 to 10 using while loop

		int num = 2; 
		while(num<=10)
		{
			int i= 1;
			while(i <= 10)
			{
				System.out.println(num + "*" + i + "=" + num *i);
				i++;

			}

			System.out.println("###########################");
			num++;
		}

		// Multiplication table from 2 to 10 using for loop----Another Method

		System.out.println("#################################################################################");

		int num1 = 2;
		while (num1 <= 10) {
			int num2 = 1;
			while (num2 <= 10) {

				System.out.print(num1 * num2 + "\t");
				num2++;
			}
			num1++;
			System.out.print("\n");
		}




	}

}
