package byteBank;

public class Administrador extends Funcionary implements AuthenticableFuncionary {
	
	
	public double getBonification() {
		return 0;
	}

	@Override
	public void setKey(String key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean login(String key) {
		// TODO Auto-generated method stub
		return false;
	}

}
