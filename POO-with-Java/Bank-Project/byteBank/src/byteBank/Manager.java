package byteBank;

//Is an extension of Funcionary
public class Manager extends Funcionary implements AuthenticableFuncionary{
	
	//method override
	@Override
	public double getBonification() {
		System.out.println("Manager Test");
		return 200;
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

