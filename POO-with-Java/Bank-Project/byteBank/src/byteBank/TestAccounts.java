package byteBank;

public class TestAccounts {
	public static void main(String[] args) {
		currentAccount ca= new currentAccount(1, 1);
		//ej exceptions: currentAccount ca= null;
		//Other error:;
		//int num=0;
		//int result=30/0;
		//System.out.println(result);

		SavingsAccount sa=new SavingsAccount(2, 3);
		ca.toDeposit(2000);
		ca.transfer(1000, sa);
		
		System.out.println(ca.getBalance());
		System.out.println(sa.getBalance());

		
	}
}
