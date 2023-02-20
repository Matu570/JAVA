public class ConditionalExample2 {
	public static void main(String[] args) {
		System.out.println("Hello world");

		int age = 21;
		int peopleAmount = 2;
		
		boolean couple=peopleAmount>1;
		boolean canEnter=age >= 18 && couple;
		
		System.out.println("Tha value of de condition is " + couple);

		if (canEnter) {
			System.out.println("You can enter");
			System.out.println("Welcome!");
		} else {
			System.out.println("You cannot enter");
		}
	}
}
