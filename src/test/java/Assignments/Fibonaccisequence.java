package Assignments;

public class Fibonaccisequence {

	public static void main(String[] args) {
		// Using for loop
		int num1 = 0, num2 = 1;
		int i=1, fibonacci, nextTerm;

		System.out.print(num1+ ", ");
		System.out.print(num2);
		for (i = 1; i <= 10; i++)
		{
			fibonacci = num1 + num2;
			num1 = num2;
			num2 = fibonacci;
			System.out.print(" " + fibonacci);
			
		}
		
		System.out.println();
		System.out.println("################################################################################");
		//Using another way
		
		int num1a = 0, num1b = 1;
		System.out.print(num1a + "\t" + num1b + "\t");

		for (int j = 1; j <= 8; j++) {
			int num3 = num1a + num1b;
			System.out.print(num3 + "\t");

			num1a = num1b;
			num1b = num3;

		}

		
		
		
		
		//Using while loop

//		while (i <= 10) {
//			System.out.print(num1 + ", ");
//
//			nextTerm = num1 + num2;
//			num1 = num2;
//			num2 = nextTerm;
//			System.out.print(" " + nextTerm);
//			i++;
//		}
		
		
		// fibonacci series using for loop----Another Method
		
		
	}

}


