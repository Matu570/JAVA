package byteBank;

public class Funcionary {
	private String name;
	private String documentNumber;
	private double salary;
	private int type;
	/*Try
	private double add;
	private double recordSalary(Funcionary funcionary) {
		this.add=funcionary.getBonification() + this.add;
		System.out.println("Current calcultation: " + this.add);
		return this.add;
	};
	*/
	
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
		return this.salary * 0.05;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
