
public class ExampleFor {
	public static void main(String[] args) {

		int result = 0;

		/*
		 * while (counter <= 10) { System.out.println(counter); result += counter;
		 * counter++; }
		 */

		for (int counter = 0; counter <= 10; counter++) {
			System.out.println(counter);
			result += counter;
		}
		System.out.println("The result is " + result);
	}
}
