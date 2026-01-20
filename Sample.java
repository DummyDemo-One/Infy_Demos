package myjavademos;



//Compiler :: convert the java code(.java) to byte code(.class)
//Interpreter(JIT(JUST-IN-TIME COMPILER)):: convert the byte code to machine(os specific) code

//2 types of error:: compilation(silly programming mistakes) , runtime(logical mistakes) 

//Outer classes/top level classes cannot be private and protected/static!!!!

//public access specifier:: filename and classname must be same!!

public class Sample extends Object//valid- //Bytecode filename:: Sample.class




//class Sample //class default access specifier is "default"(package)!!!=>Sample.class


//public class Sample 
{

	/*
	 * Package:
	 * group of similar types  of classes , interfaces and sub-packages.
	 * --used for preventing naming conflicts!
	 * void::the particular method does not return any value
	 * main: entry point method for java 
	 * static::doesn't require any object! used for memory management!
	 * memory allocated by default by the JVM
	*/

	public static void main(String[] args)  //Command line arguments(String array!)
	{
	
		//System is a built in java-class
		//out is a STATIC reserved object of java.io.PrintStream class
		//println is a method of PrintStream class

		/*
		 * class System
		 * {
		 * static PrintStream out;
		 * }
		 */

		System.out.println("Welcome");
	}

}
