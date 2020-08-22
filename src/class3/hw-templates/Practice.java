package class3;

import java.awt.Graphics;

public class Practice {

	public static void main(String[] args) {
		DrawingBoard board = new DrawingBoard(600, 600);
		Graphics pen = board.getBoard();

		board.clear();

		// Draw an outline of a pink oval.
		// Center: (200, 300)
		// Width: 100
		// Length: 50

		// Draw a filled yellow square.
		// Center: (400, 400)
		// Side length: 100

		// Draw a purple line across the screen from left to right.
		
		// Draw an orange line across the screen from top to bottom.

		board.repaint();
	}

}
