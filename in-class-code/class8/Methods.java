package class8;

public class Methods {

	public static void main(String[] args) {
		printName();

		int x = add(1, 2);
		System.out.println(x);

		printSum(1, 2);
	}

	// void returns nothing
	public static void printName() {
		System.out.println("Rissa");
	}

	// return type is int
	public static int add(int x, int y) {
		return x + y;
	}

	public static void printSum(int x, int y) { // method header
		// method body
		System.out.println(x + y);
	}

	// "403%"
	public static double getDecimalFromPercent(String percent) {
		// crazy code
		return -1;
	}

	// public static returnType methodName(optional parameters) { method body }
	// parameters or arguments are inputs
}
