package byteBank;

public class SavingsAccount extends Account {
	public SavingsAccount(int agency, int number) {
		super(agency, number);
	};
	
	@Override
	public void toDeposit(double amount) {
		this.balance += amount;
	}
}
