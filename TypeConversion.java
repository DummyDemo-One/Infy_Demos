package myjavademos;
/*
 * Converting from smaller → bigger type (int → long → float) is automatic.

No data loss for small values, but may lose precision for very large numbers.
 */


 /*
 * In Java, there are two types of casting:

Widening or implicit Casting (automatically) - converting a smaller type to a larger type size. 
byte -> short -> char -> int -> long -> float -> double.

Narrowing or explicitCasting (manually) - converting a larger type to a smaller size type. 
double -> float -> long -> int -> char -> short -> byte.
 */

 
public class TypeConversion {
	//class is EMPTY->NO OBJECT

	public static void main(String[] args) {
		int i = 100;
		long a = i;
		float b = a;
		System.out.println(i + " " + a + " " + b);

		int i1 = 34349958;
		byte b1 = (byte) i1; // explicit type casting
		System.out.println(i1 + " " + b1);// data truncated and lost!!!
		
		//Mixed types → promoted to largest type in the operation
		byte b2 = 55;
		float f1 = 4343.43f;
		float f2 = b2 * f1;// expression type promotion!!
		System.out.println(b2 + " " + f1 + " " + f2);

		System.out.println(534535.453453);// by default it is Double
		System.out.println((float) 534535.453453);// convert double to float
/*
 * ASCII values are a subset of Unicode:

A-Z = 65-90

a-z = 97-122
 */
		char a3 = 65;
		char b3 = 97;
		System.out.println("Char:: " + a3 + " " + b3);

		// Increment and decrement in char data type!
		a3++;
		b3++;
		System.out.println("Char(++):: " + a3 + " " + b3);


		a3--;
		b3--;
		System.out.println("Char(--):: " + a3 + " " + b3);
		 
		int n = 90;
		// char b11=n;//invalid
		char b11 = (char) n;
		System.out.println("Char:: " + b11);
			 
		//char hh=43.43f;//invalid=>char cannot store decimal or floating-point numbers.

		/*
		 * char stores single Unicode characters (0–65535).

Numeric values can be converted to char using explicit cast (char).

You can increment/decrement char like integers.
		 */
		 char startChar = 'C';
	        int offset = 5;
	        char nextChar = (char) (startChar + offset);
	        System.out.println("Char Arithmetic: " + startChar + " + " + offset + " = " + nextChar);
	}

}
/*
100 100 100.0
34349958 -122
55 4343.43 238888.66
534535.453453
534535.44
Char:: A a
Char(++):: B b
Char(--):: A a
Char:: Z
Char Arithmetic: C + 5 = H
*/