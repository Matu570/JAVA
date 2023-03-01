package byteBank;

public class TestBonificationControl {
	public static void main(String[] args) {
		
		Funcionary matias=new Funcionary();
		matias.setSalary(2000);
		
		Manager ximena= new Manager();
		ximena.setSalary(10000);
		
		Counter alexis=new Counter();
		alexis.setSalary(5000);
		
		BonificationControl bonificationControl = new BonificationControl();
		bonificationControl.recordSalary(matias);
		bonificationControl.recordSalary(ximena);
		bonificationControl.recordSalary(alexis);


	}
}
