package byteBank;

public class TestInternalSystem {
	public static void main(String[] args) {
		InternalSystem internalSystem= new InternalSystem();
		Manager manager1=new Manager();
		Administrador administrador1= new Administrador();
		
		internalSystem.authenticate(manager1);
		internalSystem.authenticate(administrador1);
	}
}
