package class10;

public class MathOperators {

	public static int add(int x, int y) {
		return x + y;
	}

	public static int abs(int x) {
		if (x < 0) {
			x *= -1;
		}

		return x;
	}

	public static int pow(int b, int e) {
		// Multiply b e times
		if (e == 0) {
			return 1;
		}

		int result = 1;
		for (int counter = 1; counter <= e; counter++) {
			result *= b;
		}

		return result;
	}
}
