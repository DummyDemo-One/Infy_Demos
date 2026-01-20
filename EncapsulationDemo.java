package myjavademos;
/*
 * What is Encapsulation?
 * Encapsulation = Data hiding + controlled access
 * Private data + Public methods = Encapsulation

Encapsulation means binding data and methods together and hiding the data from direct access.

In Java:
Data → private
Access → public methods
 */
/*
 * In an online shopping app:

Customer should not directly change price, tax, or total
App should calculate the bill internally
User should see only final amount

This is Encapsulation.

🔐 Why Encapsulation is Needed (Real Time)

Without encapsulation, a user could:
--Change product price
--Set tax to zero
--Modify total bill

👉 This would break business rules.

 */
class ShoppingCart {

    // 🔒 Private data members (Encapsulation)
    private String productName;
    private int quantity;
    private double price;
    private double discount;
    private double gst;
    private double totalAmount;


    // Public method to add product
    public void addProduct(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    // Public method to apply discount
    public void applyDiscount(double discount) {
        if (discount >= 0) {
            this.discount = discount;
        }
        
    }
        // Public method to calculate bill
        public void calculateBill() {
            double subtotal = price * quantity;
            gst = subtotal * 18 / 100;
            totalAmount = subtotal + gst - discount;
        }



        // Public method to display bill
        public void displayBill() {
            System.out.println("\nProduct Name : " + productName);
            System.out.println("Quantity     : " + quantity);
            System.out.println("Price        : ₹" + price);
            System.out.println("GST (18%)    : ₹" + gst);
            System.out.println("Discount     : ₹" + discount);
            System.out.println("Total Amount : ₹" + totalAmount);
        }

    }

/*
 * 
“In online shopping, the customer cannot change product price or tax.
They only add items and see the final bill.
This protection of data using methods is called encapsulation.”


Encapsulation is the process of hiding data by making variables private and accessing them through public methods.


🔍 Where Encapsulation is Used?
Concept	Example
Data hiding	private variables
Controlled access	public methods
Security	No direct field access
Business logic safety	Bill calculation inside class

 */
public class EncapsulationDemo {

	public static void main(String[] args) {
		 ShoppingCart cart = new ShoppingCart();

	        // User interacts only through methods
	        cart.addProduct("Laptop", 1, 55000);
	        cart.applyDiscount(2000);
	        cart.calculateBill();
	        cart.displayBill();

	}

}
/*

Product Name : Laptop
Quantity     : 1
Price        : ₹55000.0
GST (18%)    : ₹9900.0
Discount     : ₹2000.0
Total Amount : ₹62900.0
*/
/*

✔ Encapsulation = Protect passenger data
✔ Abstraction = Hide fare calculation logic
✔ Together = Secure, flexible, real-time system
*/
