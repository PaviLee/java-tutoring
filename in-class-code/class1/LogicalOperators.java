package class1;

public class LogicalOperators {

	public static void main(String[] args) {

		// () is always executed before && is always executed before ||
		boolean b1 = true && (true || false) && true;

		// Short circuit evaluation
		boolean everyoneIsPresent = false && true && true && true && false; // false
		boolean someoneIsPresent = true || false || false || true; // true
	}
}