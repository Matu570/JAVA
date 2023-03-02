package byteBank;

public class InternalSystem {
	private String key="12345";
	
	public boolean authenticate(AuthenticableFuncionary manager) {
		boolean canlogin=manager.login(key);
		if(canlogin) {
			System.out.println("Login succesfully");
			return true;
		}else {
			System.out.println("Login Error");
			return false;
		}
	}
	
	
}
