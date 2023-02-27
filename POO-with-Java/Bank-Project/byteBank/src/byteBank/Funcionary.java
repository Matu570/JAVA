package byteBank;

public class Funcionary {
	private String name;
	private String documentNumber;
	private double salary;
	private int type;
	
	public Funcionary() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getBonification() {
		//If type is = 1 is manager
		//If type is = 0 is funcionary
		if (this.type==0) {
			return this.salary*0.1;
		} else if (this.type==1){
			return this.salary;

		} else {
			return 0;
		}
		
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
}
