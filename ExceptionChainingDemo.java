package myjavademos;
/*
 * Exception chaining means wrapping one exception inside another exception so that the original cause is not lost.
It helps in debugging and logging by preserving the root cause of the error.
 */

/*
 * Why Exception Chaining is Needed??

Without chaining:

1.You may only see a high-level exception
2.The real cause (database error, IO failure, etc.) is lost

With chaining:

You get both:

1.What failed
2.Why it failed
 */
/*
 * Customer sees: “Transaction failed”

Bank logs show: “Transaction failed → Database timeout”

That’s exception chaining.
 */
/*
 * The original exception is preserved inside a new exception, so you get both:

High-level context (what the user/application sees)

Original cause (detailed technical reason)

 */
public class ExceptionChainingDemo {
	 static void buyProduct(String product, int quantity) throws Exception 
	 {
	        int stock = 0; // out of stock

	        try {
	            if (quantity > stock) 
	            {
	            	 // Throw an exception if stock is insufficient
	                throw new IllegalStateException("Requested " + quantity + " but only " + stock + " available."
	                );
	            }
	            // If stock is sufficient, complete the purchase
	            System.out.println("Purchased " + quantity + " x " + product);
	        } catch (IllegalStateException e) 
	        {
	            // exception chaining
	            // Wrap the original exception in a new, higher-level exception
	            // This is exception chaining: it preserves the original cause
	          
	        	throw new Exception("Purchase failed for product: " + product, e);//enabled exception chaining
	        	//throw new Exception("Purchase failed for product: " + product);//disabled exception chaining
	 	       
	        }
	 }
	public static void main(String[] args) {
		 try {
	            buyProduct("phone", 1);
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	            // Print the original exception that caused the problem
	            System.out.println("Original cause: " + e.getCause());
	        }
	}

}
/*
Error: Purchase failed for product: phone
Original cause: java.lang.IllegalStateException: Requested 1 but only 0 available.
*/

/*
Error: Purchase failed for product: phone
Original cause: null
*/