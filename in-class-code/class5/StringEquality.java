package class5;

public class StringEquality {

	public static void main(String[] args) {
		// String literal
		String str1 = "Hello";
		String str3 = "Hello";
		// String object
		String str2 = new String("Hello");

		System.out.println(str1);
		System.out.println(str2);

		// == is an equality operator
		// For all objs, they compare memory locations
		System.out.println(str1 == str2); // diff locations
		System.out.println(str1 == str3); // same locations

		// equals() method
		// For all objs, they compare content
		System.out.println(str1.equals(str2)); // true
		System.out.println(str1.equals(str3)); // true
	}

}
