package class6;

public class StringCheatsheet {

	public static void main(String[] args) {
		String str = "Hello I am Rissa!";
		int length = str.length();
		System.out.println(length);

		String hello = "Hello!";
		hello = hello.substring(2, 5);
		System.out.println(hello);

		String str1 = "ABC";
		str1 = str1.substring(3);
		System.out.println("str = " + str1);

		String str2 = "ABC";
		str2 = str2.substring(2);
		System.out.println(str2);

		String str3 = "ABC";
		char c = str3.charAt(2);
		System.out.println(c);

		String str4 = "java@gmail.com";
		int index = str4.indexOf("facebook");
		System.out.println(index);
	}

}
