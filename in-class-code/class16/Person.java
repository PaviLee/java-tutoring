package class16;

public class Person {

	// Field(s)
	// public dataType varName = value;
	public int age;
	public double height;

	// Constructor(s)
	public Person(int newAge, double newHeight) {
		age = newAge;
		height = newHeight;
	}

	// Method(s)
	// public returnType methodName(optional parameters) {}

	public boolean canDrive() {
		// If the person is 16 than they can drive
		// Return true; False otherwise

		// if (age >= 16) {
		// return true;
		// } else {
		// return false;
		// }

		return age >= 16;
	}

	public boolean canRideTheRide() {
		return height >= 5;
	}
}
