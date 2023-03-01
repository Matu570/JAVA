package byteBank;

public class TestInheritance {
	public static void main(String[] args) {
		
		Funcionary funcionary= new Manager();
		funcionary.setName("Matias");
		
		//This example does not compile, because a Funcionary cant be a manager.
		//Manager manager= new Funcionary();
		//manager.setName("Ximena");
		
		Manager manager= new Manager();
		manager.setName("Ximena");
		
		funcionary.setSalary(2000);
		manager.setSalary(10000);
	}
}
