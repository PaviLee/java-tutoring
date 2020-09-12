package class9;

public class MethodReview {

	public static void main(String[] args) {
		char lastLetter = getLastLetter("Sam");
		System.out.println(lastLetter);
	}

	public static char getFirstLetter(String str) {
		return str.charAt(0);
		// unreachable code
	}

	// Name: getLastLetter
	// Parameters: String
	// Return type: ?
	// Body: ?
	public static char getLastLetter(String str) {
		return str.charAt(str.length() - 1);
		// unreachable code
	}

	// method that can give me the name of a person based on school id

	// returnType - any dataType and void
	// methodName - name of the method that should describe what it is doing
	// opt args - can have arguments or parameters or not
	// public static returnType methodName(optional args) --> method header
	// public static returnType methodName() --> method header
	// { method body } - anything between the curly braces
}
