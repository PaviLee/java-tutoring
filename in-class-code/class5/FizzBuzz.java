package class5;

public class FizzBuzz {

	public static void main(String[] args) {
		System.out.println(fizzString("fig"));
		System.out.println(fizzString("dib"));
		System.out.println(fizzString("fib"));
	}

	public static String fizzString(String str) {
		String firstChar = str.substring(0, 1);
		String lastChar = str.substring(str.length() - 1);

		if (firstChar.equals("f") && lastChar.equals("b")) {
			return "FizzBuzz";
		}
		if (firstChar.equals("f")) {
			return "Fizz";
		}
		if (lastChar.equals("b")) {
			return "Buzz";
		}

		return str;
	}

}
