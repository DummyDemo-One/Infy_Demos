package myjavademos;
/*
JaggedArray(array-of-arrays)::
 --We can create 2D arrays but with variable number of columns in each row!
ex: int a[][]=new int[3][30];//6 elements
ex: int a[][]=new int[2][];
*/
//eX: Even though all are students (rows), the number of books (columns) varies per student.

/*
 * Imagine a bus company runs 3 trips in a day.

🚍 Trip 1: 4 passengers

🚍 Trip 2: 2 passengers

🚍 Trip 3: 5 passengers

Each trip has a different number of passengers. So we’ll store passenger names in a jagged array.
 */
/*
 * Key Points to Remember

✔ Rows can have different lengths
✔ Saves memory compared to fixed 2D arrays
✔ Perfect for real-time uneven data
✔ Very common in education, transport, shopping, reports
 */
public class JaggedArrayDemo {

	public static void main(String[] args) {
		   // Creating jagged array (array of arrays)
        String[][] passengers = new String[3][];
        
        // Different number of passengers for each trip
        passengers[0] = new String[]{"Ravi", "Anu", "Kumar", "Divya"};     // Trip 1
        passengers[1] = new String[]{"Suresh", "Meena"};                 // Trip 2
        passengers[2] = new String[]{"Arun", "Priya", "Vijay", "Rani", "John"}; // Trip 3

        System.out.println("Bus Trip Passenger Details:");
        
        // Enhanced for loop
        int tripNo = 1;
        for (String[] trip : passengers) {
            System.out.print("Trip " + tripNo + " passengers: ");
            for (String name : trip) {
                System.out.print(name + " ");
            }
            System.out.println();
            tripNo++;
        }
	}

}
