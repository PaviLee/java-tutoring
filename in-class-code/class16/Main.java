package class16;

public class Main {

	public static void main(String[] args) {

		Person p = new Person(16, 10);
//		p.age = 16;
//		p.height = 10;

		System.out.println("Age = " + p.age);
		System.out.println("Height = " + p.height);

//
//		boolean result = p.canDrive();
//		boolean result2 = p.canRideTheRide();
//
//		System.out.println(result);
//		System.out.println(result2);

		Person p2 = new Person(5, 5);

		System.out.println("Age = " + p2.age);
		System.out.println("Height = " + p2.height);

//		System.out.println(p2.canDrive());
//		System.out.println(p2.canRideTheRide());
	}
}
