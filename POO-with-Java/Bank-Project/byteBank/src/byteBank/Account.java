package byteBank;

//public and private are access modificators;
public abstract class Account {
	protected double balance;
	private int agency;
	private int number;
	private Customer holderAccount = new Customer();

	private static int total = 0;

	public static int getTotal() {
		return total;
	}

	public Account() {

	};

	public Account(int agency, int number) {
		this.agency = agency;
		this.number = number;
		System.out.println("A new account has been created here. This is the number " + total);
		Account.total++;
	}

	// does not return value
	public abstract void toDeposit(double amount);

	// does not return value
	public void withdraw(double amount) throws InsufficientBalanceException {
		if (this.balance < amount) {
			throw new InsufficientBalanceException("You have no balance");
		}
		this.balance -= amount;

	}

	public boolean transfer(double amount, Account transferTo) {
		if (this.balance >= amount) {
			try {
				this.withdraw(amount);
			} catch (Exception e) {
				e.printStackTrace();
			}
			transferTo.toDeposit(amount);
			return true;
		}
		return false;
	}

	public double getBalance() {
		return this.balance;
	}

	public int getAgency() {
		return this.agency;
	}

//	public void setAgency(int newAgency) {
//		if (newAgency > 0) {
//			this.agency = newAgency;
//		} else {
//			System.out.println("The negative values are not allowed");
//		}
//	}

	public void setHolderAccount(Customer holderAccount) {
		this.holderAccount = holderAccount;
	}

	public Customer getHolderAccount() {
		return holderAccount;
	}
}
