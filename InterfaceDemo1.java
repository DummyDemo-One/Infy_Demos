package myjavademos;
/*
 * 3️⃣ Difference Between Default and Static Methods:::
 * 
Feature						Default Method			Static Method
Belongs to	Object 			(via instance)			Interface (via interface name)
Can be overridden			Yes						No
Called using				Object of implementing class	Interface name
Purpose	Provide default behavior	Provide utility/helper functionality

Real-Time Banking Analogy::

Default method: “Check account status” – every account can use it, or override it for customization.

Static method: “Bank info” – same for all accounts, doesn’t depend on a specific account.

 */
interface Vehicle {
    // Abstract method (must be implemented by the implementing class//mandatory to override)
    void start();

    // Default method (common functionality for all vehicles//not mandatory to override)
    default void stop() {
        System.out.println("Vehicle is stopping.");
    }

    // Static method cannot be overridden (not inherited by implementing classes)
    static void service() {
        System.out.println("Vehicle is being serviced.");
    }
}
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }
}
/*
 * Car uses the default stop() method.
Bike overrides the stop() method to give its custom behavior.
 */
class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting.");
    }

    // Overriding the default stop method is OPTIONAL
    @Override
    public void stop() {
        System.out.println("Bike is stopping.");
    }
}
public class InterfaceDemo1 {
	public static void main(String[] args)  //Command line arguments(String array!)
	{
		//Polymorphic Interface Object
		  Vehicle car = new Car();
	        Vehicle bike = new Bike();

	        // Using the start method (must be implemented by each class)
	        car.start();  // Output: Car is starting.
	        bike.start(); // Output: Bike is starting.

	        // Using the inherited or overridden stop method
	        car.stop();   // Output: Vehicle is stopping. (Inherited from default method)
	        bike.stop();  // Output: Bike is stopping. (Overridden)

	        // Calling the static service method from the interface
	        Vehicle.service();  // Output: Vehicle is being serviced.
	       /*
	        * The service() method belongs to the interface, not the objects that implement it. 
	        * It is called using Vehicle.service().

Static methods are not inherited by implementing classes.
	        */
	        //car.service();/invalid
	       //bike.service();//invalid
	        
	}
}
/*
Car is starting.
Bike is starting.
Vehicle is stopping.
Bike is stopping.
Vehicle is being serviced.
*/