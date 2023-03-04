package byteBank;

public class Administrador extends Funcionary implements AuthenticableFuncionary {
	
	private UsefulClass useful;
	
	public Administrador() {
		this.useful=new UsefulClass();
	}
	
	public double getBonification() {
		return  this.getSalary();
	}

	@Override
	public void setKey(String key) {
		this.useful.setKey(key);;
		
	}

	@Override
	public boolean login(String key) {
		return this.useful.login(key);
	}

}
