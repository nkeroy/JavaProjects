package CGBanking.Bean;

public abstract class Account {
    private long acctNum;
    private double balance;
    private Person accHolder;
    
    private static int id = 1;
    
    
	public Account(double balance, Person accHolder) throws Exception {
		if (balance < 500) throw new Exception("Starting balance should be equal or more than 500");
		this.acctNum = id++;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	
	public long getAcctNum() {
		return acctNum;
	}
	/**
	public void setAcctNum(long acctNum) {
		this.acctNum = acctNum;
	}
	**/
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	/**
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	**/
	
	public void deposit(double amount) {
		setBalance(this.balance + amount);
	}
    
	// to be implemented in savings/current account
	public abstract void withdraw(double amount) throws Exception;

	@Override
	public String toString() {
		return "Account [acctNum=" + acctNum + ", accHolder=" + accHolder + "]";
	}
	
	
	
	
}
