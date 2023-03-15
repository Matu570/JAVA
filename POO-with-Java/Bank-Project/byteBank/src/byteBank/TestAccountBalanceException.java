package byteBank;

public class TestAccountBalanceException {
	public static void main(String[] args) {
		Account account = new SavingsAccount(123, 456);
		account.toDeposit(210);
		try {
			account.withdraw(210);
			account.withdraw(10);
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

