package byteBank;

public class TestManager {
	public static void main(String[] args) {
		Manager manager=new Manager();
		//manager.setSalary(5000);
		//Funcionary manager=new Funcionary();
		manager.setSalary(6000);
		manager.setType(1);
		manager.setKey("AluraOnlineCourses");
		
	
		System.out.println(manager.login("AluraOnlineCourses"));
		System.out.println(manager.getSalary());
	}
}
