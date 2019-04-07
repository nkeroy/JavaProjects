package Service;

import CGBanking.Bean.*;

public interface BankingService {

	public void deposit(Account acct, double amount);
	public void withdraw(Account acct, double amount) throws Exception;
	public void check(Account acct);
	public void profile(Account acct);

}
