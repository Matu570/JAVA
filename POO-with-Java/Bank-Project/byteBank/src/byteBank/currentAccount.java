package byteBank;

public class currentAccount extends Account {
	public currentAccount(int agency, int number) {
		super(agency, number);
	};
	
	@Override
	public boolean withdraw(double amount) {
		double comision=0.2;
		return super.withdraw(amount + comision);
	}
}
