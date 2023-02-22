class Account{
	double balance;
	int agency;
	int number;
	String holderAccount;
	
	//does not return value
	public void toDeposit(double amount){
		this.balance+=amount;
	}
	
	//does not return value
	public boolean withdraw(double amount) {
		if(this.balance>=amount) {
			this.balance-=amount;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transfer(double amount, Account transferTo){
		if (this.balance>=amount) {
			System.out.println("Succesfully");
			this.balance-=amount;
			transferTo.toDeposit(amount);
			return true;
		} else {
			return false;
		}
	}
}

