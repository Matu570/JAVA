
public class MethodsTest {
	public static void main(String[] args) {
		Account accountOfDiego= new Account();
		accountOfDiego.toDeposit(1000);

		Account accountOfMatias=new Account();
		accountOfMatias.toDeposit(500);;

		accountOfDiego.transfer(250, accountOfMatias);
		
		accountOfDiego.toDeposit(1000);
		System.out.println(accountOfDiego.getBalance());
		System.out.println(accountOfMatias.getBalance());

		
		




		
	}
}
