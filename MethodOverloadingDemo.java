package myjavademos;
/*
 * MethodOverloading:
 * 
 * Methods must have same name.

Methods must have different parameters (number or type).

Return type can be different, but alone cannot overload.

Happens at compile-time → called compile-time polymorphism.

   void applyDiscount(int percent) { ... }           // discount by percent
    void applyDiscount(double amount) { ... }        // discount by fixed amount
    void applyDiscount(String couponCode) { ... }   // discount by coupon
 */
public class MethodOverloadingDemo {

	//Garment Shop
	
    // Method 1: Show garment price
	  void bill(double price) 
	  {
	        System.out.println("Garment Price: ₹" + price);
	  }

	  // Method 2: Calculate total without GST
	    void bill(double price, int quantity) 
	    {
	        double total = price * quantity;
	        System.out.println("Total Amount (No GST): ₹" + total);
	    }

	    // Method 3: Calculate total with GST
	    void bill(double price, int quantity, double gstPercent) {
	        double total = price * quantity;
	        double gstAmount = total * gstPercent / 100;
	        double finalAmount = total + gstAmount;

	        System.out.println("Total Amount: ₹" + total);
	        System.out.println("GST (" + gstPercent + "%): ₹" + gstAmount);
	        System.out.println("Final Bill Amount: ₹" + finalAmount);
	    }

	public static void main(String[] args) {
		MethodOverloadingDemo gs=new MethodOverloadingDemo();
		
        gs.bill(1200);          // price only
        gs.bill(1200, 2);        // price + quantity
        gs.bill(1200, 2, 12);    // price + quantity + GST
        
	}

}
/*
Garment Price: ₹1200.0
Total Amount (No GST): ₹2400.0
Total Amount: ₹2400.0
GST (12.0%): ₹288.0
Final Bill Amount: ₹2688.0
*/