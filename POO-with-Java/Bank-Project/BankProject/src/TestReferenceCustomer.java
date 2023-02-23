
public class TestReferenceCustomer {
	public static void main(String[] args) {
		Customer jonatan=new Customer();
		jonatan.name="Jonatan";
		jonatan.document="36513287";
		jonatan.phoneNumber="11342134234";
		
		Account accountOfJonatan= new Account();
		accountOfJonatan.agency=50;
		accountOfJonatan.holderAccount=jonatan;
		System.out.println(accountOfJonatan.holderAccount.name);

		
		//This example generate a error
		Account accountOfDaniel=new Account();
//		accountOfDaniel.holderAccount.name="Daniel";
		System.out.println(accountOfDaniel.holderAccount.name);
		
//		Account accountOfDaniel=new Account();
//		accountOfDaniel.holderAccount=new Customer();
		
		
		
		
		
		

	}
}
