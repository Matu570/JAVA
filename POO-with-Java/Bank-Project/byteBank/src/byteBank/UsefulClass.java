package byteBank;

public class UsefulClass {
	private String key;
	
	public boolean login(String key) {
		return this.key==key;
	}
	
	public void setKey (String key) {
		this.key=key;
	}
}
