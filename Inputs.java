package myjavademos;


//import java.lang.*;//OPTIONAL - default package in java. import all the classes packages.

//import java.lang.System;//import specific classes! improves the performance of the JVM!
//import java.lang.String;

import java.util.Scanner;

public class Inputs {

	public static void main(String[] args) {
		//Read the input 
		Scanner s1=new Scanner(System.in);//in is a reserved object of InputStream(java.io)

		System.out.println("Enter ENO:: ");
		int eno1=s1.nextInt();

		/*
		 * The nextLine() method is capable of reading input till the end of the line. 
		 * So, it stops reading input from the user when the user presses the enter key
		 * 
		 * The escaping sequence of next() is space.Next() uses to read a single word and when it
		 *  gets a white space,it stops reading and the cursor back to its original position.
		 *  
		 *  | Method       | Reads          | Stops at  | Handles spaces? | Common Use            |
| ------------ | -------------- | --------- | --------------- | --------------------- |
| `next()`     | One word/token | Space/tab | ❌ No            | Reading one word      |
| `nextLine()` | Entire line    | Enter key | ✅ Yes           | Reading full sentence |

		 */
		//Always use s1.nextLine() after nextInt() or nextFloat() if you want to read String with spaces next.
		s1.nextLine();//IMPORTANT
		
		System.out.println("Enter Employeename:: ");
		//String name=s1.next();//considered the spaces (only first value considered)!
		String name=s1.nextLine();

		System.out.println("Enter Salary: ");
		float salary=s1.nextFloat();

		System.out.println("Emp::: " +eno1+ " "+name+ " "+salary);

		
	}

}
/*
Enter ENO:: 
111
Enter Employeename:: 
Lakshmi Prabha Sai
Enter Salary: 
3403294
Emp::: 111 Lakshmi Prabha Sai 3403294.0
*/