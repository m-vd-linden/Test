package nl.avans.ivp4.bankdklas;

/**
 * A checking account offers easy acces to your money for your daily
 * transactional needs
 * 
 * @author Gebruiker
 * @version solution 1 (2 lijsten)
 */
public class CheckingAccount {

	// attributes
	private String accountNumber;
	private long balance = 0;

	// constructors
	public CheckingAccount(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * 
	 * @param accountNumber
	 * @param firstDeposit
	 *            value in cent
	 */

	public CheckingAccount(String accountNumber, long firstDeposit) {
		this.accountNumber = accountNumber;
		balance += firstDeposit;
	}

	// methods
	public void deposit(long amount) {
		balance += amount;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public long getBalance() {
		return balance;
	}

	public void print() {
		System.out.println("accountNumber: " + accountNumber);
		System.out.println("Balance: " + balance + " cent ");
		System.out.println("--------------");

	}

	public long withdraw(long amount) {
		balance -= amount;
		return balance;
	}
}
