
public class ExampleScope {
	public static void main(String[] args) {
		System.out.println("Hello world");

		int age = 21;
		int peopleAmount = 2;
		
		boolean couple;
		
		if(peopleAmount>1) {
			couple=true;
		}else {
			couple=false;
		}
		
		boolean canEnter=age >= 18 && couple;

		if (canEnter) {
			System.out.println("You can enter");
			System.out.println("Welcome!");
		} else {
			System.out.println("You cannot enter");
		}
		
		System.out.println("Tha value of de condition is " + couple);
	}
	
}
