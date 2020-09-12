package class9;

public class MethodCalls {

	public static void main(String[] args) {
		int sum = findSum(10, 20);
		System.out.println(sum);

		printHelloFiveTimes();
	}

	// Purpose: print "Hello" five times on different lines
	// Parameters: ?
	// Return type: ?
	// Body: ?
	public static void printHelloFiveTimes() {
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
	}

	// Purpose: Given two numbers, compute the sum
	// Parameters: ?
	// Return type: ?
	// Body: ?
	public static int findSum(int x, int y) {
		int sum = x + y;
		return sum;
	}
}
