
public class PracticingWithVariables {
	public static void main (String[] args) {
		System.out.println("Hello World");
		
		int old=31;
		System.out.println("I have " + old + " years old");
		
		double salary=150.50;
		System.out.println("My salary is " + salary + " dollars");
		
		System.out.println("The middle of my salary is " + salary /2 + " dollars");

		int division=old/3;
		
		System.out.println(division);
		
		double variable1=230.89;
		int variable1ConverseToInt=(int)variable1; // This example is a cast... We are casting this variable
		System.out.println(variable1ConverseToInt);
		
		long extensiveNumbers=999999999999999999L;
		short shortNumbers=11233;
		byte littlesNumbers=122;
		float littleDecimalNumber=2.5F;
		
		double result= variable1 + old;
		System.out.println(result);

	}
}
