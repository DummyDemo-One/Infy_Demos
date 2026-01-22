package myjavademos;

import java.util.Scanner;

//User-defined exception for age
class AgeNotValidException11 extends Exception {
 AgeNotValidException11(String message) {
     super(message);
 }
}

//User-defined exception for deposit
class InsufficientDepositException12 extends Exception 
{  // Use Exception instead of Throwable for multi-catch
 InsufficientDepositException12(String message) 
 {
     super(message);
 }
}

/*
* Throws keyword::
* --alternative of try---catch block
* --throws followed by classnames!(NO NEW KEYWORD!)
* --throws used in the METHOD SIGNATURES!NOT INSIDE THE METHOD BODY
* --contains multiple exception also
* ex: 
* public void disp() throws IOException,SQLException,ArithmeticException
* {
* }
*/
/*
 * | Feature            | `throw`                              | `throws`                                            |
| ------------------ | ------------------------------------ | --------------------------------------------------- |
| **Type**           | Statement                            | Keyword used in method declaration                  |
| **Purpose**        | Actually **throws** an exception     | **Declares** that a method might throw an exception |
| **Used in**        | Inside method body                   | In method signature                                 |
| **Followed by**    | Exception object                     | Exception class name(s)                             |
| **Number allowed** | Only **one exception** per statement | Can declare **multiple exceptions**                 |

 */

/*
 * Are user-defined exceptions checked or unchecked?
 * 
		It depends on what you extend:
				- extends Exception → Checked
				- extends RuntimeException → Unchecked
 */

/*
 * Exception propagation is the process by which an exception is passed 
 * from the point of occurrence to the caller methods until it is handled.
 * 
 * Rule						Explanation
Unchecked exceptions	Automatically propagate
Checked exceptions		Propagate only if declared using throws
Propagation stops		When a matching catch block is found
 */
public class UserDefinedExceptionDemo2 {
	static void validateAge(String name, int age) throws AgeNotValidException11 
	{
		 if (age < 18) {
	            throw new AgeNotValidException11("Sorry " + name + ", you must be 18 or older to open an account.");
	        }
	}
	static void validateDeposit(String name, double deposit) throws InsufficientDepositException12
	{
	 if (deposit < 500) {
         throw new InsufficientDepositException12("Sorry " + name + ", minimum initial deposit is 500.");
     }
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            // Call method that throws AgeNotValidException
            validateAge(name, age);

            System.out.print("Enter initial deposit amount: ");
            double deposit = sc.nextDouble();

            // Call method that throws InsufficientDepositException
            validateDeposit(name, deposit);

            System.out.println("Welcome " + name + "! Your account is created with deposit: " + deposit);

        } catch (AgeNotValidException11 | InsufficientDepositException12 e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("Program ends.");
        }
    }
}
/*
Enter your name: Devi
Enter your age: -3
Exception: Sorry Devi, you must be 18 or older to open an account.
Program ends.
*/
/*
Enter your name: Abi
Enter your age: 20
Enter initial deposit amount: -8
Exception: Sorry Abi, minimum initial deposit is 500.
Program ends.
*/
/*
Enter your name: Thananya
Enter your age: 33
Enter initial deposit amount: 9000
Welcome Thananya! Your account is created with deposit: 9000.0
Program ends.
*/