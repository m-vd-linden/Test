package nl.avans.ivp4.bankdklas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// maak enkele rekeningen aan
		// voer enkele methoden uit op rekeningen
		// maak een bank aan
		// voeg de rekeningen toe aan de bank
		// vraag de bank om te printen


		CheckingAccount account1 = new CheckingAccount("123");
		CheckingAccount account2 = new CheckingAccount("456", 1500);
		CheckingAccount account3 = account2;
		SavingsAccount account4 = new SavingsAccount();
		StudentAccount account5 = new StudentAccount();
	
		Bank bank = new Bank();
		bank.addCheckingAccount(account1);
		bank.addCheckingAccount(account2);
		bank.addSavingsAccount(account4);
		bank.addStudentAccount(account5);
		
		bank.printOverview();

		
	}

}
