package myjavademos;

public class LabelDemo {
/*
 * Why do we use labels?

To break or continue outer loops

Normally, break or continue only affects the innermost loop.

With a label, you can break/continue a specific outer loop.

To improve readability in nested loops

Helps identify which loop you are controlling
 */
	public static void main(String[] args) {
		 	int over1 = 6;
	        int over2 = 0;  // no runs
	        int over3 = 12;
	        int over4 = 8;
	        int over5 = 0;  // no runs

	        overLoop: // Label for overs
	        for (int over = 1; over <= 5; over++) {

	            int runs = 0;

	            if (over == 1) runs = over1;
	            else if (over == 2) runs = over2;
	            else if (over == 3) runs = over3;
	            else if (over == 4) runs = over4;
	            else if (over == 5) runs = over5;

	            if (runs == 0) {
	                System.out.println("Over " + over + " scored 0 runs. Skipping...");
	                continue overLoop; // skip this over
	            }

	            System.out.println("Over " + over + " scored " + runs + " runs.");
	}

}
}
/*
Over 1 scored 6 runs.
Over 2 scored 0 runs. Skipping...
Over 3 scored 12 runs.
Over 4 scored 8 runs.
Over 5 scored 0 runs. Skipping...
*/