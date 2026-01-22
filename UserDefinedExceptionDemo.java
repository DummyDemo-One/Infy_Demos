package myjavademos;

import java.util.Scanner;

/*
Userdefined Exception::
--class must inherit from either Throwable or Exception
*/

class AgeNotValidException extends Exception
{
	  AgeNotValidException(String message) 
	  {
	        super(message);
	    }
}
class InsufficientDepositException extends Throwable
{
	 InsufficientDepositException(String message)
	 {
	        super(message);
	    }
}
public class UserDefinedExceptionDemo {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        try {
	            System.out.print("Enter your name: ");
	            String name = sc.nextLine();

	            System.out.print("Enter your age: ");
	            int age = sc.nextInt();
/*
 * 	//throw keyword:: throw or raise an user defined or built in exception explicitly
		//You can throw "only one exception" with the help of throw keyword!
			
		/*
		 * throw keyword::
		 * --throw followed by Object ex: throw new AgeRangeException
		 * --throw keyword is used within the method or block!
		 * --throw keyword cannot throw multiple exception
		 * ex: throw new AgeRangeException,NameValidationException //invalid!!
		 * 
		 */

 
	            // Check age
	            if (age < 18) {
	                throw new AgeNotValidException("Sorry " + name + ", you must be 18 or older to open an account.");
	            }
	            System.out.print("Enter initial deposit amount: ");
	            double deposit = sc.nextDouble();

	            // Check initial deposit
	            if (deposit < 500) {
	                throw new InsufficientDepositException("Sorry " + name + ", minimum initial deposit is 500.");
	            }
	            System.out.println("Welcome " + name + "! Your account is created with deposit: " + deposit);
	        }
	        catch(AgeNotValidException | InsufficientDepositException e)
	        {
	        	  System.out.println("Exception: " + e.getMessage());
	        }
	        finally 
	        {
	        	System.out.println("Program ends.");
	        }	
	        }
	}


/*
Enter your name: Devi
Enter your age: -6
Exception: Sorry Devi, you must be 18 or older to open an account.
Program ends.
*/
/*
Enter your name: Abi
Enter your age: 20
Enter initial deposit amount: 10
Exception: Sorry Abi, minimum initial deposit is 500.
Program ends.
*/
/*
Enter your name: Thananya
Enter your age: 23
Enter initial deposit amount: 4500
Welcome Thananya! Your account is created with deposit: 4500.0
Program ends.
*/