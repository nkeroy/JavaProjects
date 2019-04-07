package Main;

import CGBanking.Bean.Account;
import CGBanking.Bean.Person;
import CGBanking.Bean.SavingsAccount;
import Service.BankingService;
import Service.BankingServiceApplication;

public class Main {

	static BankingService bs;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bs = new BankingServiceApplication();
		
		// create objects
		try {
			Person roy = new Person("Roy",26);
			Account acct = new SavingsAccount(500, roy);
			bs.check(acct);
			bs.profile(acct);
			bs.deposit(acct, 200);
			bs.withdraw(acct, 500);
			bs.withdraw(acct, 500);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
