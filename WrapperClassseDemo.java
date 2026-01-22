package myjavademos;
/*
 * What are Wrapper Classes?

In Java, primitive types like int, double, char, boolean are not objects.
Wrapper classes are object versions of primitives.
Every primitive has a corresponding wrapper class:

Primitive	Wrapper Class
--------	------------
int	Integer
double	Double
char	Character
boolean	Boolean
byte	Byte
short	Short
long	Long
float	Float
 */
/*
 * Why use Wrapper Classes?
 * 1.Objects are needed for certain Java classes/methods
 * 2.Utility methods
Wrapper classes provide useful static methods:
	3.Null values
Primitives cannot be null, but wrapper objects can:
	4.Type conversion
You can easily convert between strings and numbers, or between different numeric types using wrappers.
 */
public class WrapperClassseDemo {

	/*
	 * 
Ticket count comes from machine → primitive int

Billing system expects object data → Integer

Calculation needs primitive again

	 */
	public static void main(String[] args) {
	    // Primitive value (tickets requested by passenger)
        int tickets = 3;


        /*
         * Boxing: primitive → wrapper

			Unboxing: wrapper → primitive

         */
        // Autoboxing: int -> Integer(Java automatically converts a primitive value into its corresponding wrapper object.)
        Integer ticketObject = tickets;

        // Unboxing: Integer -> int(Autounboxing is the opposite: Java automatically converts a wrapper object back to its primitive)
        int totalTickets = ticketObject;
        
        System.out.println("Tickets booked: " + totalTickets);
        
        String priceStr = "500";          // price comes as string input
        
        //int price=priceStr;//invalid from primitive to object directly! use wrapper class 
        
        int price = Integer.parseInt(priceStr);  // convert to int (primitive)
        int total = price + 100;          // now you can calculate
        System.out.println(total);        // 600

	}

}
/*
Tickets booked: 3
600
*/