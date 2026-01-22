package myjavademos;
/*
 * Command line arguments are values passed to a program when it starts, instead of taking input during runtime.
 * 
 * Command-line args allow input at program start without Scanner
 */
public class CommandLineArguments 
{
	public static void main(String[] args) 
	{
		if (args.length < 3) {
            System.out.println("Please provide principal, rate, and time as command-line arguments.");
            return;
        }
		 // Convert String args to double primitive => so use Double Wrapper classes
		double p = Double.parseDouble(args[0]);
	        double r = Double.parseDouble(args[1]);
	        double t = Double.parseDouble(args[2]);

		/*double p = args[0];
		double r = args[1];
		double t = args[2];
		*/
	        double si = (p * r * t) / 100;
	        System.out.println("Simple Interest = " + si);	
	}
}
/*
Simple Interest = 120000.0
*/