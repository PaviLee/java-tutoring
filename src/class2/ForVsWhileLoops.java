package class2;

public class ForVsWhileLoops {

	public static void main(String[] args) {
		// For loop: you know the number of times you are looping
		// For example: Printing all the even numbers between 1 and 50
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		// While loop: if you do not know when to end
		// For example: Playing a game, stop only when it is game over
		boolean gameOver = false;
		while (!gameOver) { // !
			System.out.println("I am playing the game!");
			// Crazy code that determines game over
		}
	}

}
