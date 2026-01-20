package myjavademos;
/*
 * University Student Fee System

For each student, the university stores:

Student Name
Course
Tuition Fee
Hostel Fee
Scholarship
Total Fee (calculated)


Constructor Chaining

Calling one constructor from another using this().

 */
class UniversityStudent {

    String studentName;
    String course;
    double tuitionFee;
    double hostelFee;
    double scholarship;
    double totalFee;

    // 1️⃣ Default Constructor
    UniversityStudent() 
    {
        System.out.println("Default Constructor: Student record created");
    }
/*
 * this() must be the first statement in a constructor

Used to call another constructor of the same class

Cannot be used inside methods
 */
    // 2️⃣ Parameterized Constructor (Basic details)
    UniversityStudent(String studentName, String course) {
        this(); // constructor chaining
        this.studentName = studentName;
        this.course = course;
    }
    
    // 3️⃣ Parameterized Constructor (Fees)
    UniversityStudent(String studentName, String course,
                      double tuitionFee, double hostelFee) {
        this(studentName, course); // constructor chaining
        this.tuitionFee = tuitionFee;
        this.hostelFee = hostelFee;
    }
    
    // 4️⃣ Parameterized Constructor (Fees + Scholarship)
    UniversityStudent(String studentName, String course,
                      double tuitionFee, double hostelFee,
                      double scholarship) {
        this(studentName, course, tuitionFee, hostelFee); // chaining
        this.scholarship = scholarship;
        calculateTotalFee();
    }

    // Fee Calculation Method
    void calculateTotalFee() {
        totalFee = (tuitionFee + hostelFee) - scholarship;
    }


    // Display Method
    void display() {
        System.out.println("\nStudent Name : " + studentName);
        System.out.println("Course       : " + course);
        System.out.println("Tuition Fee  : ₹" + tuitionFee);
        System.out.println("Hostel Fee   : ₹" + hostelFee);
        System.out.println("Scholarship  : ₹" + scholarship);
        System.out.println("Total Fee    : ₹" + totalFee);
    }




}
public class ConstructorChainingDemo {

	public static void main(String[] args) {

        // Default constructor
        UniversityStudent s1 = new UniversityStudent();

        // Constructor with basic details
        UniversityStudent s2 =
            new UniversityStudent("Anitha", "B.Tech");

        // Constructor with fees
        UniversityStudent s3 =
            new UniversityStudent("Rahul", "MBA", 120000, 40000);

        // Constructor with fees + scholarship
        UniversityStudent s4 =
            new UniversityStudent("Priya", "MCA", 100000, 35000, 20000);

        s4.display();

	}

}
