package javapractices;

public class UnaryOperation {

	public static void main(String[] args) {
		int a = 10;
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
		
		System.out.println("##################################################");
		
		int num = 1;

		for (int i = num; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("##################################################");

		int b = 20;
		System.out.println(b--);
		System.out.println(b);
		System.out.println(--b);
		
		System.out.println("##################################################");
		
		int num1 = 10;

		for (int i = num1; i >= 1; i--) {
			System.out.println(i);
		}

	}

}
