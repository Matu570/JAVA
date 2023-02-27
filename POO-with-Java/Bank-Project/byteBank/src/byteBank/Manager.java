package byteBank;

//Is an extension of Funcionary
public class Manager extends Funcionary{
	private String key;
	
	public void setKey(String key) {
		this.key=key;
	}
	
	public boolean login(String key) {
		return key=="AluraOnlineCourses";
	}
}

