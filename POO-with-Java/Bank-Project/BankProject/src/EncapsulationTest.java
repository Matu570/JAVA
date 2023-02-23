
public class EncapsulationTest {
	public static void main(String[] args) {
		Account account = new Account();
		Customer customer = new Customer();
		customer.setName("Pedro");
		customer.setDocument("36513256");
		
		account.setHolderAccount(customer);
		
		Customer customer2 = account.getHolderAccount();
		
		System.out.println(customer.getName());
		System.out.println(account.getHolderAccount().getName());
		System.out.println(customer2);

	}
}
