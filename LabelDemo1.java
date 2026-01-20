package myjavademos;

public class LabelDemo1 {

	public static void main(String[] args) {
//Stop Match After Target Reached=>Stop the match immediately if total runs reach or exceed 20
        int over1 = 6;
        int over2 = 5;
        int over3 = 12;
        int over4 = 8;
        int over5 = 0;

        int totalRuns = 0;

        overLoop: // Label for overs
        for (int over = 1; over <= 5; over++) {

            int runs = 0;

            if (over == 1) runs = over1;
            else if (over == 2) runs = over2;
            else if (over == 3) runs = over3;
            else if (over == 4) runs = over4;
            else if (over == 5) runs = over5;

            totalRuns += runs;
            System.out.println("Over " + over + " scored " + runs + " runs. Total = " + totalRuns);

            if (totalRuns >= 20) {
                System.out.println("Target reached! Ending match.");
                break overLoop; // stop further overs
            }
        }
	}

}
/*
Over 1 scored 6 runs. Total = 6
Over 2 scored 5 runs. Total = 11
Over 3 scored 12 runs. Total = 23
Target reached! Ending match.
*/