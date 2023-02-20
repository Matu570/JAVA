
public class ConditionalExample {
	public static void main(String[] args) {
		System.out.println("Hello world");

		int age = 17;
		int amount = 2;

		if (age >= 18) {
			System.out.println("You can enter");
			System.out.println("Welcome!");
		} else {
			if (amount >= 2) {
				System.out.println("You are a minor, but you can enter");
			} else {
				System.out.println("You cannot enter");
			}

		}
	}
}
