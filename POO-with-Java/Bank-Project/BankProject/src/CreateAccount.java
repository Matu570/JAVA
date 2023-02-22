
public class CreateAccount {
	public static void main(String[] args) {
		Account firstAccount = new Account();
		firstAccount.balance = 1000;
		System.out.println(firstAccount.balance);
		System.out.println(firstAccount.agency);


		Account secondAccount = new Account();
		secondAccount.balance=2000;
		System.out.println(secondAccount.balance);
		
		System.out.println(firstAccount);
		System.out.println(secondAccount);
	}
}
