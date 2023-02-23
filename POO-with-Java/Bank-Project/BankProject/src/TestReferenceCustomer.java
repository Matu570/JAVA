
public class TestReferenceCustomer {
	public static void main(String[] args) {
		Customer jonatan=new Customer();
		jonatan.setName("Jonatan");
		jonatan.setDocument("36513287");
		jonatan.setPhoneNumber("11342134234");
		
		Account accountOfJonatan= new Account();
		//accountOfJonatan.agency=50;
		//accountOfJonatan.holderAccount=jonatan;
		//System.out.println(accountOfJonatan.holderAccount.getName());

		
		Account accountOfDaniel=new Account();
		accountOfDaniel.holderAccount.setName("Daniel");
		System.out.println(accountOfDaniel.holderAccount.getName());
		
//		Account accountOfDaniel=new Account();
//		accountOfDaniel.holderAccount=new Customer();
		
		
		
		
		
		

	}
}
