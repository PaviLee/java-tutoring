package class10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Absolute value calculator
		// Taking user input, compute and print
		// out the absolute value

		// Scanner scanner = new Scanner(System.in);
		// System.out.println("Enter a number: ");
		// int num = scanner.nextInt();
		// int absValue = MathOperators.abs(num);
		// System.out.println(absValue);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a base: ");
		int b = scanner.nextInt();
		System.out.println("Enter a exponent: ");
		int e = scanner.nextInt();
		int result = MathOperators.pow(b, e);
		System.out.println(result);
	}
}
