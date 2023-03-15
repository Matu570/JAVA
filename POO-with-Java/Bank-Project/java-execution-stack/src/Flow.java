
public class Flow {

	public static void main(String[] args) {
		System.out.println("Start of main");
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("End of main");
	}

	private static void method1() throws MyException {
		System.out.println("Start of method1");
		method2();
		System.out.println("End of method1");
	}

	private static void method2(){
		System.out.println("Start of method2");
		int a=50/0;//Arithmetic Exception;
		throw new MyException2("My exception has been throwed");
		/*for (int i = 1; i <= 5; i++) {
			System.out.println(i);

			try {
				if (i==3) {
					int num = 0;
				int result = i / 0;
				System.out.println(result);
				}
				
				String test=null;
				System.out.println(test.toString());

			} catch (ArithmeticException | NullPointerException exception) {
				System.out.println("Catch Exception");
				System.out.println(exception.getMessage());
				exception.printStackTrace();
			}

		}
		;*/
		
		//System.out.println("End of method2");
	}
}
