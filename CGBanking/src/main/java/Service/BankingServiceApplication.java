package Service;

import CGBanking.Bean.Account;

public class BankingServiceApplication implements BankingService {

	public void deposit(Account acct, double amount) {
		// TODO Auto-generated method stub
		acct.deposit(amount);
		check(acct);
	}

	public void withdraw(Account acct, double amount) throws Exception {
		// TODO Auto-generated method stub
		acct.withdraw(amount);
		check(acct);
	}

	public void check(Account acct) {
		// TODO Auto-generated method stub
		System.out.println(acct.getBalance());
	}

	public void profile(Account acct) {
		// TODO Auto-generated method stub
		System.out.println(acct.toString());
	}

}
