package byteBank;

public class TestFuncionary {
	public static void main(String[] args) {
		Funcionary matias=new Funcionary();
		matias.setName("Matias");
		matias.setDocumentNumber("34534533");
		matias.setSalary(2000);
		matias.setType(0);
		
		System.out.println(matias.getSalary());
		System.out.println(matias.getBonification());

	}
}
