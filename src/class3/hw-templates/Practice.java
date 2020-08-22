package class3;

import java.awt.Graphics;

public class Practice {

	public static void main(String[] args) {
		DrawingBoard board = new DrawingBoard(600, 600);
		Graphics pen = board.getBoard();

		board.clear();

		// Draw a filled pink oval.
		// Center: (200, 300)
		// Width: 100
		// Length: 50

		// Draw a filled yellow square.
		// Center: (400, 400)
		// Side length: 100

		// Draw a purple line from the top to the bottom of the screen in the
		// center width-wise.

		board.repaint();
	}

}
