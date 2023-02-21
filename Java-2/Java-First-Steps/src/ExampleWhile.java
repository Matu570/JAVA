
public class ExampleWhile {
	public static void main(String[] args) {

		int counter = 0;
		int result = 0;

		while (counter <= 10) {
			System.out.println(counter);
			result += counter;
			counter++;
		}
		System.out.println("The result is " + result);
	}
}
