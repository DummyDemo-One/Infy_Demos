package myjavademos;
/*

| Feature       | Stack Memory             | Heap Memory                 |
| ------------- | ------------------------ | --------------------------- |
| Stores        | Methods, local variables | Objects, instance variables |
| Allocation    | Compile time             | Runtime                     |
| Deallocation  | Automatic                | Garbage Collector           |
| Speed         | Very fast ⚡              | Slower                      |
| Size          | Small                    | Large                       |
| Lifetime      | Short                    | Long                        |
| Access        | Direct                   | Reference-based             |
| Thread Safety | Thread-safe              | Not thread-safe             |
*/

/*
 * Stack is fast, small, temporary, and stores local stuff.

Heap is large, slower, long-lived, and stores dynamic objects.
 */
//Objects of this class will be stored in HEAP memory
class ElectricityBill {

    // Instance variables
    // These are stored inside the object in HEAP memory
    String customerName;
    int units;

    // Constructor: called when object is created
    // Memory for this object is allocated in HEAP
    ElectricityBill(String name, int u) {

        // Assigning values to heap variables
        customerName = name;
        units = u;

        // Just to show when object is created
        System.out.println("Object Created for " + customerName);
    }
 // Method to calculate electricity bill
    void calculateBill() {

        // Local variable
        // Stored in STACK memory
        int rate = 5;

        // Local variable for calculation
        // Stored in STACK memory
        int totalAmount = units * rate;

        // Printing the bill details
        System.out.println("Customer Name : " + customerName);
        System.out.println("Units Consumed: " + units);
        System.out.println("Total Bill    : Rs." + totalAmount);
    }

    //OBJECT CLASS=>toString(),finalize()
    // finalize() method
    // This method is called by Garbage Collector
    // before removing the object from HEAP memory
    protected void finalize() {

        // Message to show that GC is cleaning this object
        System.out.println("Garbage Collected object of " + customerName);
    }


}
public class MemoryManagementDemo {

	public static void main(String[] args) {
        // bill1 is a reference variable
        // bill1 is stored in STACK memory
        // Object is created in HEAP memory
        ElectricityBill bill1 = new ElectricityBill("Ravi", 120);

        // Method call
        // Method variables go to STACK
        bill1.calculateBill();
        
        // Making the object unreachable
        // Now no reference is pointing to the heap object
        bill1 = null;

//Output related to Garbage Collection is not guaranteed because GC execution is controlled by JVM, not the programmer.

        //Garbage Collection is JVM dependent,
        // Requesting JVM to run Garbage Collector
        // This is only a request, not a guarantee
        System.gc();

        // End of program
        System.out.println("End of main method");
        



	}

}
/*
Object Created for Ravi
Customer Name : Ravi
Units Consumed: 120
Total Bill    : Rs.600
End of main method
Garbage Collected object of Ravi
*/

