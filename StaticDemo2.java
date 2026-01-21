package myjavademos;
//--------- Product Class ---------
class Product 
{
    // STATIC data member (shared)
	static double taxRate = 0.18; // 18% GST

    // NON-STATIC members
	int productId;
    String productName;
    double price;
    int quantity;

    // Constructor
    Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    
    // STATIC method: calculate tax for any amount
    static double calculateTax(double amount) {
        return amount * taxRate;
    }
//Non-static methods (like calculateTotalPrice()) can access both instance variables and static methods.
    // NON-STATIC method: calculate total price for this product
    double calculateTotalPrice() {
        double amount = price * quantity;
        double total = amount + calculateTax(amount); // call static method for tax
        return total;
    }

}

//--------- Billing Service Class ---------
class BillingService 
{
	 // NON-STATIC method: show product details in cart
    void showProduct(Product p) //Passing Product class Object/reference variable
    {
        System.out.println("Product: " + p.productName);
        System.out.println("Quantity: " + p.quantity);
        System.out.println("Unit Price: " + p.price);
        System.out.println("Total Price with Tax: " + p.calculateTotalPrice());
        System.out.println("------------------------------");
    }
    // STATIC method: apply discount on total cart amount
    static double calculateDiscount(double totalAmount, double discountRate) {
        return totalAmount - (totalAmount * discountRate);
    }

}
//--------- Main Class ---------

public class StaticDemo2 {
	public static void main(String[] args) {
        // Create products
        Product p1 = new Product(101, "Mobile", 20000, 1);
        Product p2 = new Product(102, "Headphones", 2000, 2);
        Product p3 = new Product(103, "Smart Watch", 5000, 1);


        // Store products in cart array
        Product[] cart = {p1, p2, p3};

        // Non-static call to display each product
        BillingService billing = new BillingService();
        double totalCartAmount = 0;
        for (Product p : cart) {
            billing.showProduct(p);//p1,p2,p3
            totalCartAmount += p.calculateTotalPrice(); // sum total prices
        }
        // STATIC method call using ClassName.methodName()
        double discountedAmount = BillingService.calculateDiscount(totalCartAmount, 0.1);

        System.out.println("Total Cart Amount before Discount: " + totalCartAmount);
        System.out.println("Total Cart Amount after 10% Discount: " + discountedAmount);

        // STATIC method call from Product class for clarity
        double taxOn5000 = Product.calculateTax(5000);
        System.out.println("Tax on Rs.5000 (for example): " + taxOn5000);

        // NON-STATIC method call from Product object (example)
        double totalPriceP1 = p1.calculateTotalPrice();
        System.out.println("Total price of " + p1.productName + ": " + totalPriceP1);

	}

}
/*
Product: Mobile
Quantity: 1
Unit Price: 20000.0
Total Price with Tax: 23600.0
------------------------------
Product: Headphones
Quantity: 2
Unit Price: 2000.0
Total Price with Tax: 4720.0
------------------------------
Product: Smart Watch
Quantity: 1
Unit Price: 5000.0
Total Price with Tax: 5900.0
------------------------------
Total Cart Amount before Discount: 34220.0
Total Cart Amount after 10% Discount: 30798.0
Tax on Rs.5000 (for example): 900.0
Total price of Mobile: 23600.0
*/