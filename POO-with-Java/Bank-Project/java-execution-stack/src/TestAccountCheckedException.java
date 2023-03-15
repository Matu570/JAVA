
public class TestAccountCheckedException {
	public static void main(String[] args) {
		Account account = new Account();
		try {
			account.toDeposit();
		} catch (MyException e) {
			System.out.println("Exception catched");
			e.printStackTrace();
		}
	}
}
