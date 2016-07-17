import comp102x.IO;

/**
* A bank account has a balance and the owner who can make
* deposits to and withdrawals from the acount
*/

public class BankAccount{		  // BankAcount - is an identifier and the word class is the declaration of the class
	private double balance=0.0;      // initial balance is set to zero
	private String owner="NoName";  // Name of owner.This are instance variables

// Constructors. The declartion of them
	/**
	* Default constructor for a bank account with zero balance
	*/

	public BankAccount(){}	// The name of the class "BankAccount" is used as the name of the constructor
	/**
	* Construct a balance with a given initial balance and owner's name
	* @param initialBalance 	the initial balance
	* @param name			name of the owner
	*/
	public BankAccount(double initialBalance, String name){
		balance=initialBalance;
		owner=name;
	}

	/**
	* Method for depositing money to the bak account
	* @param dAmount	the amount to be deposited
	*/
	
	public void deposit(double dAmount){
		balance=balance + dAmount;

	}


	/** 
	* Method for withdrawing money from the bank account
	* @param wAmount	the amount to be withdrawn

	public void withdraw(double wAmount){
		balance = balance - wAmount;
	}

	/** 
	* Method for getting the current balance of the bank account
	* @return the current balance
	*/

	public double getBalance(){
		return balance;
	
	}

	/**
	* Main method for testing the bank account
	*/

	public static void main(String[] args){
	
	// To create the bankAccount object first we need to asses the BankAccount class a name wich build it
		BankAccount testAccount;
		
		testAccount = new BankAccount();

	// We can create the class like assesing the variable also" BankAccount testAccount = new BankAccount();
		testAccount.deposit(100);  // Calling the method deposit
		testAccount.withdraw(50);
		IO.outputln(testAccount.owner + "'s account has a balance of $" + testAccount.balance); //print it to the screen

	// Create a new bank Account

		BankAccount myAccount = new BankAccount(100,"TC");
		myAccount.deposit(100);
		myAccount.withdraw(50);
		IO.outputln(myAccount.owner + "'s account has a balance of $" + myAccount.balance);



	}

}


