
public class CreateAccount {
	public static void main(String[] args) {
		
		Account firstAccount = new Account();
		firstAccount.toDeposit(1000);
		System.out.println(firstAccount.getAgency());
		System.out.println(firstAccount.getAgency());


		Account secondAccount = new Account();
		secondAccount.balance=2000;
		System.out.println(secondAccount.getBalance());
		
		System.out.println(firstAccount);
		System.out.println(secondAccount);
	}
}
