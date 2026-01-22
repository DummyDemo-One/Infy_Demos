package myjavademos;
//Base interface for all banking operations
interface BankOperations 
{
 double MIN_BALANCE = 1000; // final public static constant

 void deposit(double amount);//public abstract void deposit(double amount)
 void withdraw(double amount);//public abstract void withdraw(double amount)
 double calculateInterest();//public abstract double calculateInterest()

 default void accountStatus() {
     System.out.println("Default Account Status from BankOperations interface.");
 }

 static void bankInfo() {
     System.out.println("Welcome to ABC Online Bank!");
 }
}


//Extended interface for online features inherits BankOperations
interface OnlineBanking extends BankOperations {
 void transfer(double amount, BankAccount1 toAccount);
 void payBill(String billName, double amount);

 default void onlineHelp() {
     System.out.println("Contact support@abcbank.com for help.");
 }
}

//Base class for all bank entities
class BankEntity {
 String bankName;
 String branch;

 BankEntity(String bankName, String branch) {
     this.bankName = bankName;
     this.branch = branch;
 }

 void printBankDetails() {
     System.out.println("Bank: " + bankName + " | Branch: " + branch);
 }
}


//BankAccount extends BankEntity and implements OnlineBanking (interface)
class BankAccount1 extends BankEntity implements OnlineBanking {
 int accountNumber;
 String accountType;
 double balance;
 boolean isActive;

 // Constructor
 BankAccount1(int accountNumber, String accountType, double balance, boolean isActive,
             String bankName, String branch) {
     super(bankName, branch); // call BankEntity constructor
     this.accountNumber = accountNumber;
     this.accountType = accountType;
     this.balance = balance;
     this.isActive = isActive;
 }

 // Implement abstract methods from BankOperations
 @Override
 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited $" + amount + ". New balance: $" + balance);
 }

 @Override
 public void withdraw(double amount) {
     if (balance - amount >= MIN_BALANCE) {
         balance -= amount;
         System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
     } else {
         System.out.println("Withdrawal denied. Minimum balance: $" + MIN_BALANCE);
     }
 }

 @Override
 public double calculateInterest() {
     double rate = accountType.equalsIgnoreCase("Savings") ? 0.05 : 0.02;
     double interest = balance * rate;
     System.out.println("Interest for account " + accountNumber + ": $" + interest);
     return interest;
 }
 // Implement abstract methods from OnlineBanking
 @Override
 public void transfer(double amount, BankAccount1 toAccount) {
     if (balance - amount >= MIN_BALANCE) {
         balance -= amount;
         toAccount.balance += amount;
         System.out.println("Transferred $" + amount + " from account " + accountNumber +
                            " to account " + toAccount.accountNumber);
     } else {
         System.out.println("Transfer failed. Minimum balance: $" + MIN_BALANCE);
     }
 }

 @Override
 public void payBill(String billName, double amount) {
     if (balance - amount >= MIN_BALANCE) {
         balance -= amount;
         System.out.println("Paid $" + amount + " for " + billName + ". Remaining balance: $" + balance);
     } else {
         System.out.println("Bill payment failed. Minimum balance: $" + MIN_BALANCE);
     }
 }

 // Override default method from BankOperations is OPTIONAL
 @Override
 public void accountStatus() {
     System.out.println("Account " + accountNumber + " (" + accountType + ") | Balance: $" + balance +
                        " | Active: " + isActive);
 }
 // Print account details=>Implementation class own method
 void printDetails() {
     printBankDetails(); // call BankEntity method
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Account Type: " + accountType);
     System.out.println("Balance: $" + balance);
     System.out.println("Active: " + isActive);
     System.out.println("---------------------------");
 }
}

public class InterfaceDemo_21 {

	public static void main(String[] args) {
        // Call static method from interface
        BankOperations.bankInfo();
        System.out.println();

        // Create bank accounts
        BankAccount1 acc1 = new BankAccount1(101, "Savings", 5000, true, "ABC Bank", "Downtown");
        BankAccount1 acc2 = new BankAccount1(102, "Current", 3000, true, "ABC Bank", "Uptown");
        BankAccount1 acc3 = new BankAccount1(103, "Savings", 8000, true, "ABC Bank", "Downtown");

        BankAccount1[] accounts = {acc1, acc2, acc3};

        System.out.println("=== Initial Account Details ===");
        for (BankAccount1 acc : accounts) 
        	acc.printDetails();
        
        // Perform transactions
        System.out.println("=== Transactions ===");
        acc1.deposit(2000);
        acc2.withdraw(1500);
        acc3.transfer(1000, acc2);
        acc1.payBill("Internet", 1200);

        // Calculate interest
        System.out.println("\n=== Interest Calculation ===");
        for (BankAccount1 acc : accounts) acc.calculateInterest();

        // Account status
        System.out.println("\n=== Account Status ===");
        for (BankAccount1 acc : accounts) acc.accountStatus();

        // Online help
        System.out.println("\n=== Online Help ===");
        acc1.onlineHelp();

	}

}
/*
Welcome to ABC Online Bank!

=== Initial Account Details ===
Bank: ABC Bank | Branch: Downtown
Account Number: 101
Account Type: Savings
Balance: $5000.0
Active: true
---------------------------
Bank: ABC Bank | Branch: Uptown
Account Number: 102
Account Type: Current
Balance: $3000.0
Active: true
---------------------------
Bank: ABC Bank | Branch: Downtown
Account Number: 103
Account Type: Savings
Balance: $8000.0
Active: true
---------------------------
=== Transactions ===
Deposited $2000.0. New balance: $7000.0
Withdrew $1500.0. New balance: $1500.0
Transferred $1000.0 from account 103 to account 102
Paid $1200.0 for Internet. Remaining balance: $5800.0

=== Interest Calculation ===
Interest for account 101: $290.0
Interest for account 102: $50.0
Interest for account 103: $350.0

=== Account Status ===
Account 101 (Savings) | Balance: $5800.0 | Active: true
Account 102 (Current) | Balance: $2500.0 | Active: true
Account 103 (Savings) | Balance: $7000.0 | Active: true

=== Online Help ===
Contact support@abcbank.com for help.
*/