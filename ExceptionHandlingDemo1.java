package myjavademos;
/*
What is Exception Handling?

An exception is an unexpected error that occurs while a program is running.

Example: Dividing by zero, opening a file that doesn’t exist, or accessing a null value.

Exception handling is the way a program catches these errors and deals with them gracefully, instead of crashing.
*/
/*
 * Object
  ↳ Throwable
      ↳ Error
      ↳ Exception
           ↳ Checked Exceptions
           ↳ Unchecked Exceptions (RuntimeException and its subclasses)
 */
/*
 * | Feature                | **Checked Exception**                                  | **Unchecked Exception**                                                         |
| ---------------------- | ------------------------------------------------------ | ------------------------------------------------------------------------------- |
| **Type**               | **Compile-time exception**                             | **Runtime exception**                                                           |
| **Compiler checks?**   | ✅ Yes – Must be handled or declared                    | ❌ No – Not required to handle                                                   |
| **Extends**            | `Exception` (but **not** `RuntimeException`)           | `RuntimeException` (and its subclasses)                                         |
| **When it occurs?**    | During **compilation**                                 | During **program execution**                                                    |
| **Handling required?** | ✅ Must use `try-catch` or `throws`                     | ❌ Optional to handle                                                            |
| **Examples**           | `IOException`, `SQLException`, `FileNotFoundException` | `NullPointerException`, `ArithmeticException`, `ArrayIndexOutOfBoundsException` |

 */
/*
 * --CheckedException(higher failure rate)=>inherits the classes from Exception class
 * --UncheckedException(mostly programming mistakes)=>inherits the classes 
 * from RuntimeException 
 *  * --Error and all the subclasses are Unchecked exception
 *  */

public class ExceptionHandlingDemo1 {

	public static void main(String[] args) {
		//System.out.println("Divide:: "+(12/0));;//WITHOUT EXCEPTION HANDLING=>//NO COMPILATION ERROR BUT RUNTIME ERROR WILL COME=>LEADS TO ABNORMAL TERMINATION
				try
				{
					System.out.println("Divide:: "+(12/2));
					int a[]=new int[511];
					a[1000]=57050;
				}
				//only one catch block will get executed!
				//Specific exception catch block contains more priority
				//Multiple catch block order::: first specific exception classes, then super classes(Throwable,Exception)
				catch(ArrayIndexOutOfBoundsException e)//specific exception class!!!valid!
				{
					System.out.println("Check the array index!");
					e.printStackTrace();//looks like detailed JVM error msg
				}

				catch(Throwable e)//super class for all exception classes! valid! handle all the issues!
				//catch(Exception e)//Common exception class! handle all the issues!
				//catch(ArithmeticException e)//specific exception to he handled
				{
					System.out.println("Division By Zero issue!!!");
					System.out.println("Exception object:: "+e);//e.toString()
					System.out.println("Exception error message:: "+e.getMessage());
				}
				
				//optional block
				//finally block always get executed! both success and failure scenarios!
				//The finally block is used to guarantee cleanup, like closing files or releasing resources, regardless of success or failure in the try block.
				finally//similar to static block
				{
					System.out.println("Finally Block:: DB Connection Close(),IO File Close(),signout()");
				}
				System.out.println("Program continues normally...!!!");	


	}

}
/*
Divide:: 6
Check the array index!
java.lang.ArrayIndexOutOfBoundsException: Index 1000 out of bounds for length 511
	at myjavademos.ExceptionHandlingDemo1.main(ExceptionHandlingDemo1.java:45)
Finally Block:: DB Connection Close(),IO File Close(),signout()
Program continues normally...!!!
*/