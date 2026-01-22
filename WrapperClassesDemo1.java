package myjavademos;
class BankAccount2
{
    Integer accountNumber; // wrapper for int
    Double balance;        // wrapper for double
    Boolean isActive;      // wrapper for boolean

    // Constructor
    BankAccount2(int accountNumber, double balance, boolean isActive) //constructor input is primitiove
    {
        // primitives automatically boxed to wrapper classes
    	this.accountNumber = accountNumber; 
        this.balance = balance;
        this.isActive = isActive;
    }

    // Deposit using primitive double (autoboxed automatically)
    void deposit(double amount) {
        balance += amount; // balance (Double) unboxed to double, then added, then boxed back
        System.out.println("Deposited $" + amount + ", new balance: $" + balance);
    }
    /*
     * Arithmetic operators in Java only work with primitives.

When you write balance -= amount with wrapper objects, Java automatically:
Unboxes → computes → Boxes.

So even if both LHS and RHS are Double, unboxing occurs implicitly.

     */
    // Withdraw using wrapper Double (unboxing happens automatically)
    void withdraw(Double amount) {
        balance -= amount; // Double unboxed automatically
        System.out.println("Withdrew $" + amount + ", new balance: $" + balance);
    }

    // Print details using primitives extracted from wrappers
    void printDetails() {
        int accNum = accountNumber; // unboxing Integer → int
        double bal = balance;       // unboxing Double → double
        boolean active = isActive;  // unboxing Boolean → boolean

        System.out.println("Account Number: " + accNum);
        System.out.println("Balance: $" + bal);
        System.out.println("Active: " + active);
        System.out.println("-------------------");
    }


}
public class WrapperClassesDemo1 {

	public static void main(String[] args) {
		// primitives
        int accNumPrimitive = 101;
        double balPrimitive = 5000.0;
        boolean activePrimitive = true;

        // Autoboxing primitives into wrapper class when creating account
        BankAccount2 acc = new BankAccount2(accNumPrimitive, balPrimitive, activePrimitive);

        System.out.println("=== Initial Account Details ===");
        acc.printDetails();

        System.out.println("=== Transactions ===");
        // Using primitive for deposit
        double depositAmount = 1500.0;
        acc.deposit(depositAmount); // autoboxing/unboxing happens internally

        // Using wrapper for withdraw
        Double withdrawAmount = 2000.0;
        acc.withdraw(withdrawAmount);

        System.out.println("\n=== Final Account Details ===");
        acc.printDetails();


	}

}
/*
=== Initial Account Details ===
Account Number: 101
Balance: $5000.0
Active: true
-------------------
=== Transactions ===
Deposited $1500.0, new balance: $6500.0
Withdrew $2000.0, new balance: $4500.0

=== Final Account Details ===
Account Number: 101
Balance: $4500.0
Active: true
-------------------
*/