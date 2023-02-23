
public class AccessTest {
	public static void main(String[] args) {
		Account account = new Account();
		account.setAgency(-7);
		account.toDeposit(400);
		account.withdraw(300);
		
		System.out.println(account.getBalance());
		System.out.println(account.getAgency());

	}
}
