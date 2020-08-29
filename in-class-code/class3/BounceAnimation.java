package class3;

import java.awt.Color;
import java.awt.Graphics;

public class BounceAnimation {

	public static void main(String[] args) throws InterruptedException {
		DrawingBoard board = new DrawingBoard(600, 600);
		Graphics pen = board.getBoard();

		int cX = 300;
		int cY = 300;
		int radius = 50;
		int mX = -5;

		while (true) {
			board.clear();

			pen.setColor(Color.CYAN);
			pen.fillOval(cX - radius, cY - radius, radius * 2, radius * 2);
			cX += mX;

			// Check the bounds of the circle
			if (cX - radius <= 0 || cX + radius >= 600) {
				mX *= -1;
			}

			board.repaint();

			Thread.sleep(15);
		}
	}

}
