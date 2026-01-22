package myjavademos;
/*
 * An abstract class is a class that cannot be instantiated on its own. It can contain:

Abstract methods (methods without implementation)

Concrete methods (methods with implementation)

Fields/variables

Think of it as a partially complete blueprint for other classes.
 */

/*
 * | Feature           | Abstract Class                       | Interface                                            |
| ----------------- | ------------------------------------ | ---------------------------------------------------- |
| **Instantiation** | Cannot instantiate                   | Cannot instantiate                                   |
| **Methods**       | Can have abstract + concrete methods | Usually abstract; default/static allowed             |
| **Fields**        | Can have instance variables          | Only constants (public static final)                 |
| **Inheritance**   | Single inheritance (`extends`)       | Multiple inheritance (`implements`)                  |
| **Constructors**  | Can have constructors                | Cannot have constructors                             |
| **When to use**   | Shared code + common behavior        | Only method contracts + multiple inheritance of type |

Use abstract classes when classes share common behavior or state.

Use interfaces when you only want to enforce method contracts across unrelated classes.

Abstract class: “Some parts implemented, some left to children.”

Interface: “Nothing implemented, only promises.”
 */
abstract class MobileShowroom 
{
    // Fields (common to all mobiles)
    String model;
    String brand;
    double price;
    
 // Constructor to initialize common fields
    public MobileShowroom(String model, String brand, double price) {
        this.model = model;
        this.brand = brand;
        this.price = price;
    }
 // Concrete method (can be used as is or overridden)
     public double calculateTax() {
        return price * 0.18; // assuming 18% tax
    }

     // Abstract methods (must be implemented by subclasses)
     abstract void displayDetails();
     abstract double calculateDiscount();
     
     // Additional concrete method to display basic info
     public void showInfo() {
         System.out.println("Brand: " + brand);
         System.out.println("Model: " + model);
         System.out.println("Price: " + price);
     }
}

//Concrete Class - Smartphone
class Smartphone extends MobileShowroom 
{
    // Additional fields specific to Smartphone
    String operatingSystem;

    // Constructor to initialize Smartphone-specific fields
    public Smartphone(String model, String brand, double price, String operatingSystem) {
        super(model, brand, price);
        this.operatingSystem = operatingSystem;
    }

    // Implement abstract method
    @Override
    void displayDetails() {
        System.out.println("Smartphone Details:");
        showInfo();
        System.out.println("Operating System: " + operatingSystem);
    }
    
    // Implement abstract method for discount calculation
    @Override
    double calculateDiscount() {
        // Applying 10% discount on Smartphones
        return price * 0.10;
    }
}

//Concrete Class - FeaturePhone
class FeaturePhone extends MobileShowroom {

    // Additional fields specific to FeaturePhone
    int batteryLife; // Battery life in hours

    // Constructor to initialize FeaturePhone-specific fields
    public FeaturePhone(String model, String brand, double price, int batteryLife) {
        super(model, brand, price);
        this.batteryLife = batteryLife;
    }
    // Implement abstract method
    @Override
    void displayDetails() {
        System.out.println("Feature Phone Details:");
        showInfo();
        System.out.println("Battery Life: " + batteryLife + " hours");
    }
    
    // Implement abstract method for discount calculation
    @Override
    double calculateDiscount() {
        // Applying 5% discount on Feature Phones
        return price * 0.05;
    }
    public void dummy()
    {
    	System.out.println("Testing for Object casting");
    }
}
public class AbstractClassesDemo {
	public static void main(String[] args) {
		//MobileShowroom ob=new MobileShowroom();//Abstract classes cannot be instantiated/bcos partial BLUEPRINT
		
		//Smartphone phone1=new Smartphone("Galaxy S22", "Samsung", 1000.00, "Android");
		//FeaturePhone phone2 = new FeaturePhone("3310", "Nokia", 50.00, 48);

		  // Creating instances of Smartphone and FeaturePhone
		//Polymorphic Object
        MobileShowroom phone1 = new Smartphone("Galaxy S22", "Samsung", 1000.00, "Android");
        MobileShowroom phone2 = new FeaturePhone("3310", "Nokia", 50.00, 48);
      
        // Displaying details of both phones
        phone1.displayDetails();
        System.out.println("Discount: $" + phone1.calculateDiscount());
        System.out.println("Tax: $" + phone1.calculateTax());
        
        System.out.println("\n");
        
        phone2.displayDetails();
        System.out.println("Discount: $" + phone2.calculateDiscount());
        System.out.println("Tax: $" + phone2.calculateTax());
        //phone2.dummy();
        ((FeaturePhone)phone2).dummy();//Object casting
	}

}
/*
Smartphone Details:
Brand: Samsung
Model: Galaxy S22
Price: 1000.0
Operating System: Android
Discount: $100.0
Tax: $180.0


Feature Phone Details:
Brand: Nokia
Model: 3310
Price: 50.0
Battery Life: 48 hours
Discount: $2.5
Tax: $9.0
Testing for Object casting
*/