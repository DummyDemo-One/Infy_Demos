package myjavademos;
/*
 * Constructor Order in Java::::::
Base class → Derived class
 */
/*
 * | Feature   | `super()`                      | `super(args)`                        |
| --------- | ------------------------------ | ------------------------------------ |
| Calls     | Default constructor            | Parameterized constructor            |
| Arguments | No                             | Yes                                  |
| Use case  | Parent has default constructor | Parent has parameterized constructor |
| Mandatory | No (if default exists)         | Yes (if no default constructor)      |

//Default constructor of base class is automatically loaded in derived class

//Parameterized constructor of base class, CANNOT be inherited, 
//So we have to use SUPER keyword!!!


 */
//Base class
//class Account //valid
class Account extends Object//valid
{
 Account() 
 {
     System.out.println("Account constructor called");
 }
}

//Derived class
class SavingsAccount extends Account {
 SavingsAccount() 
 {
		//Java enforces the super keyword must be ""first statement"" in constructor!
	 super(); // optional (added by compiler)=>super() is implicitly added if not written
     System.out.println("SavingsAccount constructor called");
 }
}

//Main class
public class InheritanceDemo2 {
 public static void main(String[] args) {
     SavingsAccount sa = new SavingsAccount();
 }
}
/*
Account constructor called
SavingsAccount constructor called
*/