package Assignments;

public class MultiplicationTable_forloop {

	public static void main(String[] args) {
		// Multiplication table from 2 to 10 using for loop

		for(int num = 2; num <= 10; ++num)
		{
			for(int i = 1; i <= 10; ++i)
			{
				System.out.println(num + "*" + i + "=" + num *i);

			}
			System.out.println("###########################");
		}


		// Multiplication table from 2 to 10 using for loop----Another Method

		System.out.println("######################################################################################");   

		// 2*1 ,2*2,2*3
		// 3*1...

		for (int i = 2; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(i * j + "\t");
			}

			System.out.println();

		}

	}

}
