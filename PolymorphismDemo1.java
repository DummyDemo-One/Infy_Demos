package myjavademos;

/*
 * Polymorphism simplifies code and makes it extensible and flexible by allowing objects of different
 * types to be treated as objects of a common superclass.
 * 
 * Extendability: Easily add new behavior (new classes) without modifying existing code.
 * 
 * Key Points:

Single method call, multiple behaviors: Different classes can implement the same method, 
but each class can have its own behavior for that method.

Method overriding is a key concept of polymorphism, where a subclass provides its 
own implementation of a method that is already defined in its superclass.
 */

/*
 * Key Benefits of Polymorphism:

Flexibility: The same code can work with different types of objects, providing a uniform interface for them.

Maintainability: You can extend behavior in subclasses without changing existing code.

Code Reusability: The superclass can define common functionality while subclasses customize specific behavior.
 */
//--------- Base Class ---------
class House 
{
 String ownerName;
 double area;      // in square meters
 double pricePerSqM; // price per square meter

 // Constructor
 House(String ownerName, double area, double pricePerSqM) {
     this.ownerName = ownerName;
     this.area = area;
     this.pricePerSqM = pricePerSqM;
 }

 // Method to calculate total price
 double calculatePrice() {
     return area * pricePerSqM;
 }

 // Display info
 void displayInfo() {
     System.out.println("Owner: " + ownerName);
     System.out.println("Area: " + area + " sqm");
     System.out.println("Price per sqm: Rs. " + pricePerSqM);
     System.out.println("Total Price: Rs. " + calculatePrice());
     System.out.println("-------------------------");
 }
}
/*
 * is-a relationship:
 * 
 * Elephant IS-A Animal
 * Manager IS-A Employee, Developer IS-A Employee, HR IS-A Employee.
 * Circle IS-A Shape, Rectangle IS-A Shape, Triangle IS-A Shape.
 * 
 */
//--------- Derived Class with Method Overriding ---------
class LuxuryHouse extends House //is-a relatiohip
{
    double luxuryTax; // extra tax for luxury houses

    // Constructor
    LuxuryHouse(String ownerName, double area, double pricePerSqM, double luxuryTax) {
        super(ownerName, area, pricePerSqM); // call parent base constructor
        this.luxuryTax = luxuryTax;
    }
    /*
     * The @Override annotation is a helpful tool in Java to ensure that methods are correctly 
     * overriding superclass methods. 
     * It provides compile-time checking to prevent errors, 
     * improves code readability, and enhances maintainability.
     What Does @Override Do?

It tells the compiler that the method in the subclass is meant to override a method in the superclass.

If the method in the superclass does not exist, or if the method signature does not match, 
the compiler will throw an error. This helps catch potential bugs at compile time, rather than runtime.

Why Use @Override?

Helps prevent mistakes: It helps ensure you're overriding the method correctly. 
If you accidentally mistype the method signature, you'll get a compile-time error.

Improves readability: It clearly indicates that the method is overriding a method in the superclass, 
making the code easier to understand.
     */
    @Override
    //method overriding
    double calculatePrice() {
        return super.calculatePrice() + luxuryTax; // base price + luxury tax
    }
    @Override
    //Method overriding
    void displayInfo() {
        super.displayInfo(); // call base class displayInfo
        System.out.println("Luxury Tax: Rs. " + luxuryTax);
        System.out.println("Total Luxury House Price: Rs. " + calculatePrice());
        System.out.println("-------------------------");
    }

}
public class PolymorphismDemo1 {

	public static void main(String[] args) {
	     // Polymorphic objects
	     House h1 = new House("Abi", 120, 20000);            // Base class object
	        House h2 = new LuxuryHouse("Thananya", 150, 25000, 500000); // Derived class object as base type
	        House h3 = new LuxuryHouse("Sai", 200, 30000, 800000); // Another derived object
   
	        //LuxuryHouse h4=new House("Abinaya", 120, 20000); //invalid
	
	        // Array of polymorphic objects
	        House[] houses = {h1, h2, h3};


	        System.out.println("=== Real-time House Price Calculation ===");

	        // Polymorphic behavior: calls correct displayInfo() dynamically
	        for (House h : houses) {
	            h.displayInfo(); // dynamic method dispatch
	        }

	}

}
/*
=== Real-time House Price Calculation ===
Owner: Abi
Area: 120.0 sqm
Price per sqm: Rs. 20000.0
Total Price: Rs. 2400000.0
-------------------------
Owner: Thananya
Area: 150.0 sqm
Price per sqm: Rs. 25000.0
Total Price: Rs. 4250000.0
-------------------------
Luxury Tax: Rs. 500000.0
Total Luxury House Price: Rs. 4250000.0
-------------------------
Owner: Sai
Area: 200.0 sqm
Price per sqm: Rs. 30000.0
Total Price: Rs. 6800000.0
-------------------------
Luxury Tax: Rs. 800000.0
Total Luxury House Price: Rs. 6800000.0
-------------------------
*/