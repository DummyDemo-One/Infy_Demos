package myjavademos;
/*
 * Class → Blueprint / Template

A class is like the blueprint of a car.
But a blueprint itself isn’t a car — it just describes what a car will be.

Object → Real Instance

An object is a real car made from the blueprint.

Encapsulation → Protecting Data

In OOP, encapsulation means hiding internal details and allowing access through methods (like startCar()).

Abstraction → Focus on Important Details

In OOP, abstraction means showing only what’s necessary and hiding complex details.

Polymorphism → Same Action, Different Behavior

Pressing the accelerator makes a car speed up or a bike speed up, but the action is the same: accelerate.
===========================================
 Class → Blueprint of something.

Object → Actual thing made from the blueprint.

Encapsulation → Protect your stuff.

Inheritance → Share features.

Polymorphism → Same action, different ways.

Abstraction → Show only what’s needed.
 */
public class OOPSDemo {
//Vendor info
	//4 access specifier:: public,private,protected(inheritance), default or package(invisible)
/*
 * Instance Variables

Definition: Variables declared inside a class but outside any method, constructor, or block.

Belongs to object: Each object of the class has its own copy.

Default values: Automatically initialized (0 for int, 0.0 for float, null for objects, false for boolean).

Scope: Can be used throughout the class in all methods.
 */
	private int vendorid;
	public String vendorname;
	String place;//default or package access specifier
	int a,b;//default or package access specifier
	//All These methods are called as 4=>"NON STATIC METHODS"

	public void display()
	{
		System.out.println("My Java First Method Loaded!");
	}
	public void showrecord()
	{
		System.out.println("Vendor:: "+vendorid+ " "+vendorname+ " "+place);
	}
	private float multiply(float x)
	{
		return x*x;
	}
	void add(int x,int y)//default access specifier, x and y are local variables
	{
		a=x;
		b=y;
		System.out.println("Add:: "+(a+b));
	}
	//main is a static method

	public static void main(String[] args) {
		OOPSDemo v1=new OOPSDemo();//NAMED OBJECT
		v1.display();
		v1.showrecord();//objectname.methodname
		v1.vendorid=1001;
		v1.vendorname="Dell";
		v1.place="Chennai";
		v1.showrecord();//objectname.methodname
		
		float result=v1.multiply(1.1F);
		System.out.println("Mul:: "+result);
		System.out.println("Mul:: "+v1.multiply(1.2f));
		
		System.out.println("Mul:: "+new OOPSDemo().multiply(1.2f));//Dynamic memory=>ANONYMOUS OBJECT
		new OOPSDemo().display();	
	
		System.out.println("Before ADD():: "+v1.a + " "+v1.b);//default values
		v1.add(12, 10);//x,y
		System.out.println("After ADD():: "+v1.a + " "+v1.b);
	
		//default values ONLY for instance variable
		//local variable require explicit initialization
		
		int c=1000;
		System.out.println("Main Method(Local Variable)::: "+c);
		
	}

}
