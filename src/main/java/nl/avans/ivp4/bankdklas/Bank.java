package nl.avans.ivp4.bankdklas;

import java.util.ArrayList;

/**
 * Contains saving accounts and checking accounts
 * 
 * @author Gebruiker
 * @version solution 1
 */

public class Bank {
	// attributes
	ArrayList<CheckingAccount> listCheckingAccounts;
	ArrayList<SavingsAccount> listSavingsAccounts;
	ArrayList<StudentAccount> listStudentAccounts;

	// constructors (initialiseren: maak de attributen aan en geef ze een
	// beginwaarde)
	public Bank() {
		listCheckingAccounts = new ArrayList<CheckingAccount>();
		listSavingsAccounts = new ArrayList<SavingsAccount>();
		listStudentAccounts = new ArrayList<StudentAccount>();
	}

	public void addCheckingAccount(CheckingAccount newAccount) {
		listCheckingAccounts.add(newAccount);
	}

	public void addSavingsAccount(SavingsAccount newAccount) {
		listSavingsAccounts.add(newAccount);
	}
	
	public void addStudentAccount(StudentAccount newAccount) {
		listStudentAccounts.add(newAccount); 
	}

	// methods
	public void printOverview() {
		for (CheckingAccount account : listCheckingAccounts) {
			account.print();
		}
		for (SavingsAccount account : listSavingsAccounts) {
			account.print();
		}
		for (StudentAccount account : listStudentAccounts) {
			account.print();
		}
}
}