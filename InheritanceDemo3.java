package myjavademos;

import java.util.Scanner;

/*
 * Real-Time Scenario:::

Person (Base Class)

Name, Age, Gender

Student (Derived Class)

Roll Number, Department, Marks, Total, Percentage, Tuition Fees

ScholarshipStudent (Child of Student)

Scholarship eligibility, Discount on fees (if percentage ≥ threshold)


Features:

Fees calculated dynamically based on department
Scholarship applied automatically based on percentage


Person → Student → ScholarshipStudent

When a class is derived from another derived class, it is called Multilevel Inheritance.

Grandparent → Parent → Child
 */

//Base class
class Person {
 protected String name;
 protected int age;
 protected String gender;

 public Person(String name, int age, String gender) {
     this.name = name;
     this.age = age;
     this.gender = gender;
 }

 public void displayPerson() {
     System.out.println("Name   : " + name);
     System.out.println("Age    : " + age);
     System.out.println("Gender : " + gender);
 }
}
//Derived class: Student
class Student extends Person {
    protected String rollNumber;
    protected String department;
    protected double marks1, marks2, marks3;
    protected double total;
    protected double percentage;
    protected double tuitionFees;

    public Student(String name, int age, String gender, String rollNumber,
            String department, double marks1, double marks2, double marks3) {
        super(name, age, gender);
        this.rollNumber = rollNumber;
        this.department = department;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        calculateResults();
        calculateTuitionFees();
    }
    private void calculateResults() {
        total = marks1 + marks2 + marks3;
        percentage = total / 3;
    }

    // Dynamic tuition fees based on department
    private void calculateTuitionFees() {
        switch (department.toLowerCase()) {
            case "computer science":
                tuitionFees = 60000;
                break;
            case "electronics":
                tuitionFees = 55000;
                break;
            case "mechanical":
                tuitionFees = 50000;
                break;
            default:
                tuitionFees = 45000;
        }
    }
    
    public void displayStudent() {
        displayPerson();//parent class
        System.out.println("Roll No.    : " + rollNumber);
        System.out.println("Department  : " + department);
        System.out.println("Marks 1     : " + marks1);
        System.out.println("Marks 2     : " + marks2);
        System.out.println("Marks 3     : " + marks3);
        System.out.println("Total Marks : " + total);
        System.out.println("Percentage  : " + percentage + "%");
        System.out.println("Tuition Fees: ₹" + tuitionFees);
    }



}

//Child class: ScholarshipStudent
class ScholarshipStudent extends Student {
    private boolean scholarshipEligible;
    private double discount;

    public ScholarshipStudent(String name, int age, String gender, String rollNumber,
            String department, double marks1, double marks2, double marks3) {

    	super(name, age, gender, rollNumber, department, marks1, marks2, marks3);
        calculateScholarship();
    }
    //Like a university system where scholarships are calculated automatically for each student.

    private void calculateScholarship() {
        if (percentage >= 80) {
            scholarshipEligible = true;
            discount = tuitionFees * 20 / 100; // 20% discount
        } else if (percentage >= 70) {
            scholarshipEligible = true;
            discount = tuitionFees * 10 / 100; // 10% discount
        } else {
            scholarshipEligible = false;
            discount = 0;
        }
    }

    public void displayScholarshipStudent() {
        displayStudent();
        System.out.println("Scholarship Eligible: " + (scholarshipEligible ? "Yes" : "No"));
        System.out.println("Discount on Fees    : ₹" + discount);
        System.out.println("Final Fees          : ₹" + (tuitionFees - discount));
    }

}
public class InheritanceDemo3 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        ScholarshipStudent[] students = new ScholarshipStudent[n];

        // Input student details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Name: ");//Person class
            String name = sc.nextLine();

            System.out.print("Age: ");//Person class
            int age = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Gender: ");//Person class
            String gender = sc.nextLine();

            System.out.print("Roll Number: ");//Student class
            String rollNo = sc.nextLine();

            System.out.print("Department: ");//Student class
            String dept = sc.nextLine();

            System.out.print("Marks 1: ");//Student class
            double m1 = sc.nextDouble();
            System.out.print("Marks 2: ");//Student class
            double m2 = sc.nextDouble();
            System.out.print("Marks 3: ");//Student class
            double m3 = sc.nextDouble();
            sc.nextLine(); // consume newline
            
            students[i] = new ScholarshipStudent(name, age, gender, rollNo, dept, m1, m2, m3);

        }
        // Display all students
        System.out.println("\n--- Student Details with Scholarship ---");
        for (ScholarshipStudent s : students) {
            s.displayScholarshipStudent();
            System.out.println("----------------------------------------");
        }

	}

}
/*
Enter number of students: 2

Enter details for Student 1
Name: Thananya
Age: 21
Gender: Female
Roll Number: 1001
Department: Electronics
Marks 1: 80
Marks 2: 90
Marks 3: 98

Enter details for Student 2
Name: Abi
Age: 21
Gender: Female
Roll Number: 1002
Department: Mechanical
Marks 1: 50
Marks 2: 60
Marks 3: 50

--- Student Details with Scholarship ---
Name   : Thananya
Age    : 21
Gender : Female
Roll No.    : 1001
Department  : Electronics
Marks 1     : 80.0
Marks 2     : 90.0
Marks 3     : 98.0
Total Marks : 268.0
Percentage  : 89.33333333333333%
Tuition Fees: ₹55000.0
Scholarship Eligible: Yes
Discount on Fees    : ₹11000.0
Final Fees          : ₹44000.0
----------------------------------------
Name   : Abi
Age    : 21
Gender : Female
Roll No.    : 1002
Department  : Mechanical
Marks 1     : 50.0
Marks 2     : 60.0
Marks 3     : 50.0
Total Marks : 160.0
Percentage  : 53.333333333333336%
Tuition Fees: ₹50000.0
Scholarship Eligible: No
Discount on Fees    : ₹0.0
Final Fees          : ₹50000.0
----------------------------------------
*/