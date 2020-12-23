package class17;

import java.awt.Color;

public class Square {

	// Field(s) - state

	public Color color;
	public int sideLength;

	// Constructor(s) - initialization of fields

	public Square() {
		color = Color.MAGENTA;
		sideLength = 15;
	}

	public Square(Color newColor, int newSideLength) {
		color = newColor;
		sideLength = newSideLength;
	}

	// Method(s) - jobs, actions

	// public returnType methodName(params) {
	//
	// }

	public void draw() {
		// Draw itself
		System.out.println("I have been drawn.");
	}

	public void rotate() {
		// Rotate itself
		System.out.println("I have rotated.");
	}

}
