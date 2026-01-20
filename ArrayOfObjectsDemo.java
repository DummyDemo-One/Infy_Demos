package myjavademos;

import java.util.Scanner;

//An array of objects is used to store multiple objects of the same class in a single array structure.
class BankAccount {

    // Private fields (Encapsulation)
    private String accountHolder;
    private String accountNumber;
    private String accountType;
    private double balance;
    private double interestRate;
    private double minBalance;

    // Constructor
    public BankAccount(String accountHolder, String accountNumber, String accountType,
                       double balance, double interestRate, double minBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.interestRate = interestRate;
        this.minBalance = minBalance;
    }

    // Getters
    public String getAccountHolder() { return accountHolder; }
    public String getAccountNumber() { return accountNumber; }
    public String getAccountType() { return accountType; }
    public double getBalance() { return balance; }

    //Bank manager cannot set negative interest rate.

    // Setters for controlled fields
    public void setInterestRate(double interestRate) {
        if(interestRate >= 0) this.interestRate = interestRate;
    }

    // Deposit money
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if(amount > 0 && balance - amount >= minBalance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    

    // Calculate interest
    public double calculateInterest() {
        return balance * interestRate / 100;
    }


    // Display account summary
    public void displayAccountSummary() {
        System.out.println("\n--- Account Summary ---");
        System.out.println("Account Holder: " + getAccountHolder());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Type  : " + getAccountType());
        System.out.println("Balance       : ₹" + getBalance());
        System.out.println("Interest Rate : " + interestRate + "%");
        System.out.println("Interest Earned: ₹" + calculateInterest());
        System.out.println("Minimum Balance: ₹" + minBalance);
    }

}

public class ArrayOfObjectsDemo {

	public static void main(String[] args) 
	{
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of accounts to create: ");
	        int n = sc.nextInt();
	        sc.nextLine(); // consume newline
/*
 * Bank stores many customer accounts, not just one.

Each index → one customer account
 */
	        BankAccount[] accounts = new BankAccount[n];

	        // Input account details
	        for(int i = 0; i < n; i++) 
	        {
	            System.out.println("\nCreating Account " + (i + 1));

	            System.out.print("Account Holder Name: ");
	            String name = sc.nextLine();

	            System.out.print("Account Number: ");
	            String accNo = sc.nextLine();

	            System.out.print("Account Type (Savings/Current): ");
	            String type = sc.nextLine();

	            System.out.print("Initial Balance: ");
	            double balance = sc.nextDouble();

	            System.out.print("Interest Rate (%): ");
	            double rate = sc.nextDouble();

	            System.out.print("Minimum Balance: ");
	            double minBal = sc.nextDouble();
	            sc.nextLine(); // consume newline

	            accounts[i] = new BankAccount(name, accNo, type, balance, rate, minBal);
	            //accounts[0],accounts[1],accounts[2]..................
	        	
	        }
	        

	        // Perform transactions
	        for(BankAccount acc : accounts) {
	            System.out.println("\nTransactions for " + acc.getAccountHolder());

	            System.out.print("Deposit Amount: ");
	            acc.deposit(sc.nextDouble());

	            System.out.print("Withdraw Amount: ");
	            acc.withdraw(sc.nextDouble());

	            acc.displayAccountSummary();
	        }


	}

}
/*
Enter number of accounts to create: 2

Creating Account 1
Account Holder Name: Devi
Account Number: 111
Account Type (Savings/Current): Savings
Initial Balance: 5000
Interest Rate (%): 4
Minimum Balance: 100

Creating Account 2
Account Holder Name: Abi
Account Number: 222
Account Type (Savings/Current): Current
Initial Balance: 10000
Interest Rate (%): 5
Minimum Balance: 200

Transactions for Devi
Deposit Amount: 12000
₹12000.0 deposited successfully.
Withdraw Amount: 1000
₹1000.0 withdrawn successfully.

--- Account Summary ---
Account Holder: Devi
Account Number: 111
Account Type  : Savings
Balance       : ₹16000.0
Interest Rate : 4.0%
Interest Earned: ₹640.0
Minimum Balance: ₹100.0

Transactions for Abi
Deposit Amount: 200
₹200.0 deposited successfully.
Withdraw Amount: 500
₹500.0 withdrawn successfully.

--- Account Summary ---
Account Holder: Abi
Account Number: 222
Account Type  : Current
Balance       : ₹9700.0
Interest Rate : 5.0%
Interest Earned: ₹485.0
Minimum Balance: ₹200.0
*/

/*
Enter number of accounts to create: 1

Creating Account 1
Account Holder Name: thananya
Account Number: 2222
Account Type (Savings/Current): Savings
Initial Balance: 9000
Interest Rate (%): 4
Minimum Balance: 1000

Transactions for thananya
Deposit Amount: 10000
₹10000.0 deposited successfully.
Withdraw Amount: 45000
Insufficient balance or invalid amount.

--- Account Summary ---
Account Holder: thananya
Account Number: 2222
Account Type  : Savings
Balance       : ₹19000.0
Interest Rate : 4.0%
Interest Earned: ₹760.0
Minimum Balance: ₹1000.0
*/