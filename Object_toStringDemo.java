package myjavademos;
/*
 * toString() is a method that gives a string representation of an object.

It's a method that every Java class inherits from the base Object class, and it can be overridden 
by your custom classes to provide more useful or meaningful string outputs.

By default, it returns a memory address, which isn't very useful for human understanding.

Overriding toString() allows you to provide a custom representation, 
making it useful for debugging, logging, and displaying meaningful object information.
 */
//class Apartment extends Object=>valid
class Apartment {
    int number;        // Apartment number
    String owner;      // Owner's name
    double area;       // Area in sq. ft.

    // Constructor
    Apartment(int number, String owner, double area) {
        this.number = number;
        this.owner = owner;
        this.area = area;
    }
    @Override
    public String toString() 
    {
        return "Apartment[number=" + number + ", owner=" + owner + ", area=" + area + " sq.ft]";
    }	
}
public class Object_toStringDemo {
	public static void main(String[] args) {
        Apartment apt1 = new Apartment(101, "Devi", 750.5);
        Apartment apt2 = new Apartment(102, "Abi", 900.0);

        // Default printing calls toString() automatically
        System.out.println(apt1);
        System.out.println(apt2);

        // Explicit call to toString()
        System.out.println(apt1.toString());
        System.out.println(apt2.toString());
	}

}
/*
 * Before Overriding toString() method:
 * ====================================
 * 
 * myjavademos.Apartment@372f7a8d
myjavademos.Apartment@2f92e0f4
myjavademos.Apartment@372f7a8d
myjavademos.Apartment@2f92e0f4

 */
/*
 *  After Overriding toString() method:
 *  ===================================
 * Apartment[number=101, owner=Devi, area=750.5 sq.ft]
Apartment[number=102, owner=Abi, area=900.0 sq.ft]
Apartment[number=101, owner=Devi, area=750.5 sq.ft]
Apartment[number=102, owner=Abi, area=900.0 sq.ft]

 */
