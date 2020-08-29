package class2;

public class Loops {

	public static void main(String[] args) {
		// While Loop
		int counter = 1; // 1 - 1000
		while (counter <= 1000) {
			System.out.println(counter);
			// counter = counter + 1; BAD
			// counter += 1; OK
			counter++; // unary operator OK
		}

		// For Loop
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

}
