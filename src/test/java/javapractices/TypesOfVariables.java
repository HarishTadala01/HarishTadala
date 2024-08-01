package javapractices;

public class TypesOfVariables {

	public static void main(String[] args) {

		System.out.println(Variables.Mob);
		Variables variables = new Variables();
		System.out.println(variables.a);
		variables.add();
		variables.test();
	}

}

class Variables {

	// instance member variables
	int a = 10;
	public float b = 10.67f;

	// static member variables
	public static int c = 10;

	// final member variables
	public final int d = 20;
	static final int Mob = 78655665;

	public void test() {
		int e = 20 + 10;
		System.out.println(e);

	}

	public void add() {
		int f = a + d;
		System.out.println(f);

	}

}
