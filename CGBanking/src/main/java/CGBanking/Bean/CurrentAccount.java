package CGBanking.Bean;

public class CurrentAccount extends Account {

	private boolean overdraftLimit = false;
	
	public CurrentAccount(double balance, Person accHolder) throws Exception {
		super(balance, accHolder);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amount) throws Exception {
		// TODO Auto-generated method stub
		if (overdraftLimit) throw new Exception("You have reached overdraft limit");
		else {
			setBalance(getBalance() - amount);
			if (getBalance() <= 0) overdraftLimit = true;
		}
			
	}
	
	
}
