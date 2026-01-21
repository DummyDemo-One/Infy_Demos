package myjavademos;
/*
 * | **Feature**         | **Usage**                    | **Explanation**                                                     | **Example**                            |
| ------------------- | ---------------------------- | ------------------------------------------------------------------- | -------------------------------------- |
| **Final Variable**  | `final` variable             | A **constant** whose value cannot be changed once initialized.      | `final int MAX_SPEED = 100;`           |
| **Final Method**    | `final` method               | A method that **cannot be overridden** by subclasses.               | `public final void showDetails() {}`   |
| **Final Class**     | `final` class                | A class that **cannot be subclassed** or extended.                  | `public final class Vehicle {}`        |
| **Final Parameter** | `final` parameter in methods | A method parameter that **cannot be reassigned** inside the method. | `public void setAge(final int age) {}` |

 */

/*
 * Feature	Effect
final class	Cannot be inherited at all
final method	Cannot be overridden in any subclass
final constant	Value cannot be changed
Non-final class with final method	Class can be inherited, but final method cannot be overridden

💡 Tip for Exams/Viva:

If the class itself is final, no subclass is possible → all methods are protected from overriding automatically.

If the class is non-final, you can extend it, but final methods remain unchangeable in subclasses.

 */
//Final class: cannot be inherited
final class SystemAdministrator extends Object
{
    // Final constant
    static final double BASE_ALLOWANCE = 40000;

    // Non-static fields
    String name;
    int experienceYears;
    int extraResponsibilities;

    // Constructor
    SystemAdministrator(String name, int experienceYears, int extraResponsibilities) {
        this.name = name;
        this.experienceYears = experienceYears;
        this.extraResponsibilities = extraResponsibilities;
    }

    // Final method: calculate total allowance=>Cannot be overridden in subclasses
    final double calculateTotalAllowance() {
        return BASE_ALLOWANCE + (experienceYears * 1500) + (extraResponsibilities * 1000);
    }
    // Non-final method: display info=>Can be overridden in subclasses
    void displayInfo() {
        System.out.println("Admin: " + name);
        System.out.println("Experience: " + experienceYears + " years");
        System.out.println("Extra Responsibilities: " + extraResponsibilities);
        System.out.println("Total Allowance: Rs. " + calculateTotalAllowance()); // calling final method
        System.out.println("-------------------------");
    }
}

//Final class cannot be inherited.
/*class JuniorAdministrator extends SystemAdministrator
{
	JuniorAdministrator(String name, int experienceYears, int extraResponsibilities) {
		super(name, experienceYears, extraResponsibilities);
	}
//Method Overriding=>The method in the subclass must have the same name, return type, and parameter list 
	//as the method in the superclass.
	//Final method cannot be overridden ❌ Cannot override
	/*double calculateTotalAllowance()
	{
		return 11.0;
	}*/

public class FinalKeywordDemo {

	public static void main(String[] args) {
		  // Create admins
        SystemAdministrator a1 = new SystemAdministrator("Abi", 8, 5);
        SystemAdministrator a2 = new SystemAdministrator("Devi",5, 3);

        // Array of admins
        SystemAdministrator[] admins = {a1, a2};

        System.out.println("Base Allowance for all admins: Rs. " + SystemAdministrator.BASE_ALLOWANCE);
        System.out.println("==============================");

        // Display info for each admin
        for (SystemAdministrator admin : admins) {
            admin.displayInfo();
        }

	}

}
/*
Base Allowance for all admins: Rs. 40000.0
==============================
Admin: Abi
Experience: 8 years
Extra Responsibilities: 5
Total Allowance: Rs. 57000.0
-------------------------
Admin: Devi
Experience: 5 years
Extra Responsibilities: 3
Total Allowance: Rs. 50500.0
-------------------------
*/
