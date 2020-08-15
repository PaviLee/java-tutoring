package class2;

import java.util.Scanner;

public class MathematicalOperators {

	public static void main(String[] args) {
		// + addition
		// - subtraction
		// * multiplication
		// / division
		// % modulus (remainder)

		// int-int division
		System.out.println(3 / 2); // default type: int

		// Input: 132 pennies
		// Output: 1 dollar and 32 cents

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of pennies: ");
		int numPennies = scanner.nextInt();

		int numDollars = numPennies / 100; // /
		int numRemainingPennies = numPennies % 100; // %

		System.out.println("Number of dollars: " + numDollars);
		System.out.println("Number of pennies: " + numRemainingPennies);
	}

}
