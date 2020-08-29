package class1;

import java.util.Scanner;

public class ShortCircuitEvaluation {

	public static void main(String[] args) {

		// If sqrt of user input is greater than 3, print true; otherwise, print
		// false

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please input a number: ");
		int userNumber = scanner.nextInt();

		// No use evaluating sqrt of negative numbers. If inputed number is
		// negative, does not even execute
		// Math.sqrt(userNumber) > 3 --> short circuit evaluation.
		if ((userNumber >= 0) && (Math.sqrt(userNumber) > 3)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}