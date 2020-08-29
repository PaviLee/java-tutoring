package class4;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

public class UserInputSquare {

	public static void main(String[] args) throws InterruptedException {
		DrawingBoard board = new DrawingBoard(600, 600);
		Graphics pen = board.getBoard();

		Scanner scanner = new Scanner(System.in);

		int x = 300;
		int y = 300;
		int sideLength = 100;
		int move = 100;

		while (true) {
			// Draw
			board.clear();

			pen.setColor(Color.BLACK);
			pen.fillRect(x - sideLength / 2, y - sideLength / 2, sideLength,
					sideLength);

			board.repaint();

			// Get user input
			System.out.println(
					"Enter 1 for up, 2 for down, 3 for left, and 4 for right: ");
			int number = scanner.nextInt();

			// Based on user input, change x and y coordinates
			if (number == 1) {
				y -= move;
			} else if (number == 2) {
				y += move;
			} else if (number == 3) {
				x -= move;
			} else {
				x += move;
			}

			Thread.sleep(15);
		}
	}

}
