package CGBanking.Bean;

public class SavingsAccount extends Account {
	
	final double minimumBalance = 500;
	
	public SavingsAccount(double balance, Person accHolder) throws Exception {
		super(balance, accHolder);
	}

	@Override
	public void withdraw(double amount) throws Exception {
		// TODO Auto-generated method stub
		if (getBalance() - amount < minimumBalance)
			throw new Exception(String.format("You will drop below minimum balance of %s", minimumBalance));
		else
			setBalance(getBalance() - amount);
	}
	
	

}
