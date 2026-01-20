package myjavademos;
/*
 * Question	Answer
Why constructor?	To initialize object data
When called?	At object creation
How it works?	Automatically executes, assigns values
Where used?	Wherever objects need mandatory data
 */
/*
 * | Aspect                    | **Constructor**                      | **Method**                              |
| ------------------------- | ------------------------------------ | --------------------------------------- |
| **Real-time meaning**     | Admission / Registration             | Daily activity                          |
| **Purpose**               | Initialize object data               | Perform operations / actions            |
| **When it is called**     | Automatically during object creation | Manually when we call it                |
| **Who calls it**          | JVM                                  | Programmer                              |
| **Return type**           | No return type (not even `void`)     | Must have return type (`void` or value) |
| **Name rule**             | Same as class name                   | Any valid identifier                    |
| **How many times**        | Only once per object                 | Can be called many times                |
| **Can it be inherited?**  | ❌ No                                 | ✅ Yes                                   |
| **Can it be overloaded?** | ✅ Yes                                | ✅ Yes                                   |
| **Can it be overridden?** | ❌ No                                 | ✅ Yes                                   |
| **Main use**              | Object initialization                | Business logic                          |

 */
/*
 * Different customers recharge in different ways:

Only plan amount

Plan amount + validity days

Plan amount + validity + extra data
 */

class MobileRecharge 
{
//Constructor overloading allows creating objects in multiple ways using different parameter lists in the same class.
    double amount;
    int validityDays;
    int extraDataGB;

    // 🔹 Constructor 1: Only amount
    MobileRecharge(double amt) 
    {
        amount = amt;
        validityDays = 28;
        extraDataGB = 0;
    }
    // 🔹 Constructor 2: Amount + validity
    MobileRecharge(double amt, int days) {
        amount = amt;
        validityDays = days;
        extraDataGB = 0;
    }
    // 🔹 Constructor 3: Amount + validity + extra data
    MobileRecharge(double amt, int days, int data) {
        amount = amt;
        validityDays = days;
        extraDataGB = data;
    }
    
    
}
//a Java class cannot have more than one public class in a single .java file.
//The file name must be exactly the same as that public class name
/*
 * A Java source file can contain multiple classes, 
 * but only one class can be declared as public, and the file name must match that public class.
 */
public class ConstructorDemo 
{
	public static void main(String[] args) {
		 MobileRecharge r3 = new MobileRecharge(599, 84, 10);
		  MobileRecharge r2 = new MobileRecharge(399, 56);
	        MobileRecharge r1 = new MobileRecharge(199);
	
	        System.out.println(r1.amount + " " + r1.validityDays + " days " + r1.extraDataGB + "GB");
	        System.out.println(r2.amount + " " + r2.validityDays + " days " + r2.extraDataGB + "GB");
	        System.out.println(r3.amount + " " + r3.validityDays + " days " + r3.extraDataGB + "GB");
	}

}
