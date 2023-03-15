package byteBank;

public class currentAccount extends Account {
	public currentAccount(int agency, int number) {
		super(agency, number);
	};
	
	@Override
	public void withdraw(double amount) throws InsufficientBalanceException {
		double comision=0.2;
		super.withdraw(amount + comision);
	}

	@Override
	public void toDeposit(double amount) {
		this.balance += amount;
	}
}
