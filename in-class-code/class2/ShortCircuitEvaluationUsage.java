package class2;

public class ShortCircuitEvaluationUsage {

	public static void main(String[] args) {
		// && and
		// || or
		// ! not
		// ^ xor

		boolean aliceIsHere = true;
		boolean bobIsHere = false;
		boolean carolIsHere = true;

		// If everyone is present, print "Everyone is present."; else print "Not
		// everyone is present."
		if (aliceIsHere && bobIsHere && carolIsHere) {
			System.out.println("Everyone is present.");
		} else {
			System.out.println("Not everyone is present.");
		}

		// If someone is present, print "Someone is present."; else print "No
		// one is present."
		if (aliceIsHere || bobIsHere || carolIsHere) {
			System.out.println("Someone is present.");
		} else {
			System.out.println("No one is present.");
		}
	}

}
