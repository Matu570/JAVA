
public class ConstructorTest {
	public static void main(String[] args) {
		Account account=new Account(444);
		Account account2=new Account(333);
		Account account3=new Account(444);
		
		System.out.println(Account.getTotal());

	}
}
