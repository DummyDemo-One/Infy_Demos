package myjavademos;

import java.util.Scanner;

/*
 * 
An airline has multiple flights.
Each flight may have different number of reservation fields, so we use a jagged array.

For each flight, we store:

Ticket price

Number of seats booked

GST amount

Total fare

🧠 Jagged Array Structure
flight[row][fields]

 */
public class JaggedArrayDemo1 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of flights: ");
        int flightsCount = sc.nextInt();

        // Jagged array declaration
        double[][] flights = new double[flightsCount][];


        // Input for each flight
        for (int i = 0; i < flightsCount; i++) {

            System.out.println("\nFlight " + (i + 1));

            // Each flight has 4 fields
            flights[i] = new double[4];

            System.out.print("Enter Ticket Price: ");
            flights[i][0] = sc.nextDouble();

            System.out.print("Enter Seats Booked: ");
            flights[i][1] = sc.nextDouble();
        }

        double gstPercent = 18;
        
        System.out.println("\n--- Airline Reservation Bill Details ---");

        // Enhanced for loop to process data
        for (double[] flight : flights) {

            double price = flight[0];
            double seats = flight[1];

            double baseFare = price * seats;
            double gstAmount = baseFare * gstPercent / 100;
            double totalFare = baseFare + gstAmount;

            flight[2] = gstAmount;
            flight[3] = totalFare;

            System.out.println(
                "Ticket Price: ₹" + price +
                ", Seats: " + (int)seats +
                ", GST: ₹" + gstAmount +
                ", Total Fare: ₹" + totalFare
            );
        }



	}

}
/*
Enter number of flights: 4

Flight 1
Enter Ticket Price: 10000
Enter Seats Booked: 40

Flight 2
Enter Ticket Price: 16000
Enter Seats Booked: 35

Flight 3
Enter Ticket Price: 14300
Enter Seats Booked: 5

Flight 4
Enter Ticket Price: 60000
Enter Seats Booked: 20

--- Airline Reservation Bill Details ---
Ticket Price: ₹10000.0, Seats: 40, GST: ₹72000.0, Total Fare: ₹472000.0
Ticket Price: ₹16000.0, Seats: 35, GST: ₹100800.0, Total Fare: ₹660800.0
Ticket Price: ₹14300.0, Seats: 5, GST: ₹12870.0, Total Fare: ₹84370.0
Ticket Price: ₹60000.0, Seats: 20, GST: ₹216000.0, Total Fare: ₹1416000.0
*/