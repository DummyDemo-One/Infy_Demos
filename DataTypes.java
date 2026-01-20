package myjavademos;
/*
 * Primitive data types::
* 
 * boolean(true or false(default))ex:boolean attendance;boolean result;
 * byte(1 byte)
 * short(2 byte)
 * int (4 bytes) EX: int salary;
 * long(8 bytes)
 * float (4 bytes)
 * double(8 bytes)
 * char(2 bytes)->16 BIT UNICODE CHARACTER SET->0 TO 65535(ASCII 8 BIT -0 to 255 c,c++)
 */
/*
 * Primitive → predefined, simple data types (int, float, boolean)

Non-Primitive → user-defined or object-based types (String, arrays, classes)
 */

public class DataTypes {
	//everything is inside the main method (local variables), so no object of DataTypes is required.
	//DataTypes obj=new DataTypes();//not needed
	
	public static void main(String[] args)  //Command line arguments(String array!)
	{
		byte amount = 50;
		short amount1 = 565;
		int salary = 565699;
		
		long score = 5454564;// considering as a INT DATA TYPE
		/*
		 * int is the default integral datatype in java If the value exceeds the int
		 * limit,then long datatype expect suffix either L or l.
		 */

		long score1 = 45345435435L;
		long rating = 4L;

		
		boolean attendance = false;
		
		char grade = 'A';

		String name = "Karpagavalli";// Built in class
		String location = "Tambaram" + " " + " Tamilnadu" + " " + " India";

		System.out.println(attendance);
		System.out.println("Attendance Status:: " + attendance);

		System.out.println("Grade:: " + grade + " " + "Name:: " + name + " " + "Location:: " + location);


	System.out.println("Integral values:: " + amount + " " + amount1 + " " + salary + " " + score + " " + rating
				+ " " + score1);

	// default floating point is DOUBLE!!!
	// suffix F or f is mandatory for float values!!
	// double suffix D or d is optional!
		
		
	float price = 5600.50f;
	double rate=56050.34;//d is optional
	double rate1=56050.34D;//d is optional

	float rate2=4545;//no decimal points so suffix f is not required
	System.out.println("Floating point:: "+price+ " "+rate+ " "+rate1+ " "+rate2);
	
	
	}
}
/*
 * false
Attendance Status:: false
Grade:: A Name:: Karpagavalli Location:: Tambaram  Tamilnadu  India
Integral values:: 50 565 565699 5454564 4 45345435435
Floating point:: 5600.5 56050.34 56050.34 4545.0

 */