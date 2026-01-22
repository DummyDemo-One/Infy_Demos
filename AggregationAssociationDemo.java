package myjavademos;
/*
 * 1. Is-a Relationship (Inheritance)
Definition: One class is a subtype of another (inheritance).
Example:

Car is a Vehicle
Dog is an Animal

2. Has-a Relationship
Definition: One class has another class as its part (composition or aggregation).

Example:
Car has an Engine
Library has Books

3. Association vs Aggregation (Types of Has-a)
Association	::

A general relationship where one object uses or interacts with another but they can exist independently.	
Teacher and Student	Teacher teaches Student but both exist independently.
Aggregation::

A special form of association — whole-part relationship where the part can exist independently of the whole.	
Library and Books	Books can exist outside the Library.

Association: objects use each other

Aggregation: whole-part, part can exist independently
 */
/*
 * lasses:

Vehicle (Is-a Relationship)

Car is a Vehicle (Car extends Vehicle)

Car has an Engine (Has-a) - Aggregation

Car has a Driver (Has-a) - Association
 */// Is-a relationship
class Vehicle1 {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car1 extends Vehicle1 {   // Car IS-A Vehicle
    Engine engine;           // Aggregation (Has-a)
    Driver driver;           // Association (Has-a)

    Car1(Engine engine) {
        this.engine = engine;
    }

    void setDriver(Driver driver) {
        this.driver = driver;
    }

    void startCar() {
        engine.start();
        System.out.println("Car started");
    }
}

class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Driver {
    String name;

    Driver(String name) {
        this.name = name;
    }

    void drive() {
        System.out.println(name + " is driving");
    }
}

// Usage
public class AggregationAssociationDemo
{
    public static void main(String[] args) {
        Engine engine = new Engine();      // Engine exists independently (aggregation)
        Car1 car = new Car1(engine);         // Car HAS-A Engine
        Driver driver = new Driver("John"); // Driver exists independently (association)

        car.setDriver(driver);             // Car ASSOCIATED with Driver

        car.startCar();
        driver.drive();
    }
}

/*
Engine started
Car started
John is driving
*/