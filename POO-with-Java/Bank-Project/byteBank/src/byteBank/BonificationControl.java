package byteBank;

public class BonificationControl {
	private double add;
	
	public double recordSalary(Funcionary funcionary) {
		this.add=funcionary.getBonification() + this.add;
		System.out.println("Current calcultation: " + this.add);
		return this.add;
	};
}
