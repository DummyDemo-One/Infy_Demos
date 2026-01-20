package myjavademos;
/*
 * Definition:
Inheritance is an OOP concept where one class (child/subclass) 
acquires the properties and methods of another class (parent/superclass).
 
 Use keyword extends to inherit a class.

Private members of parent are not accessible directly by child.

Constructors are not inherited, but child can call parent’s constructor using super().

Supports code reusability and reduces redundancy.
 */
/*
 * A stock trading system has all investors, but investors can hold different types of investments:

EquityInvestor → Owns stocks, calculates gain/loss

BondInvestor → Owns bonds, calculates interest earned

Common info is investor details (name, ID, portfolio value),
Special info depends on type of investment.
 */
/*
 * | Feature             | `this`        | `super`      |
| ------------------- | ------------- | ------------ |
| Refers to           | Current class | Parent class |
| Access variable     | Current class | Parent class |
| Call constructor    | `this()`      | `super()`    |
| Call method         | Current class | Parent class |
| Used in inheritance | Optional      | Mandatory    |

 */
//Parent class
class Investor {
 String name;
 int investorID;
 double portfolioValue;

 Investor(String n, int id, double value) {
     name = n;
     investorID = id;
     portfolioValue = value;
 }

 void displayInfo() {
     System.out.println("Investor Name: " + name);
     System.out.println("Investor ID  : " + investorID);
     System.out.println("Portfolio Value: ₹" + portfolioValue);
 }
}
//When multiple child classes inherit from one single parent class, it is called Hierarchical Inheritance.

//Child class 1 → Equity Investor
class EquityInvestor extends Investor {
 double stockGain; // Profit/Loss from stocks

 EquityInvestor(String n, int id, double value, double gain) 
 {
     super(n, id, value);//Calls parent constructor=super keyword must be first line in constructor
     stockGain = gain;
 }

 double calculateReturns() {
     return portfolioValue + stockGain;//Total portfolio = investment + stock profit/loss
 }

 void displayPortfolio() {
     displayInfo();
     System.out.println("Stock Gain/Loss : ₹" + stockGain);
     System.out.println("Total Portfolio : ₹" + calculateReturns());
 }
}
//Child class 2 → Bond Investor
class BondInvestor extends Investor {
 double bondInterest; // Interest earned from bonds

 BondInvestor(String n, int id, double value, double interest) {
     super(n, id, value);//Calls parent constructor=super keyword must be first line in constructor
     bondInterest = interest;
 }

 double calculateReturns() {
     return portfolioValue + bondInterest;
 }

 void displayPortfolio() {
     displayInfo();
     System.out.println("Bond Interest   : ₹" + bondInterest);
     System.out.println("Total Portfolio : ₹" + calculateReturns());
 }
}
public class InheritanceDemo1 {

	public static void main(String[] args) 
	{
	    EquityInvestor eq = new EquityInvestor("Ravi", 101, 50000, 8000);
        BondInvestor bd = new BondInvestor("Anu", 102, 60000, 4500);

        System.out.println("\n--- Equity Investor ---");
        eq.displayPortfolio();

        System.out.println("\n--- Bond Investor ---");
        bd.displayPortfolio();
	}

}
/*

--- Equity Investor ---
Investor Name: Ravi
Investor ID  : 101
Portfolio Value: ₹50000.0
Stock Gain/Loss : ₹8000.0
Total Portfolio : ₹58000.0

--- Bond Investor ---
Investor Name: Anu
Investor ID  : 102
Portfolio Value: ₹60000.0
Bond Interest   : ₹4500.0
Total Portfolio : ₹64500.0
*/