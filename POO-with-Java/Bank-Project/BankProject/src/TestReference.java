
public class TestReference {
	public static void main(String[] args) {
		
		Account firstAccount= new Account();
		firstAccount.toDeposit(200);
		
		Account secondAccount= firstAccount;
		secondAccount.toDeposit(100);;
		
		System.out.println(firstAccount.getBalance());
		System.out.println(secondAccount.getBalance());
		
		System.out.println(firstAccount);
		System.out.println(secondAccount);
	}
}
