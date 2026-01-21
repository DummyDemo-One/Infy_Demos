package myjavademos;
//--------- Ticket Class ---------
class Ticket {

    // Non-static fields (per ticket)
    int ticketNumber;
    String passengerName;
    double distanceKm;

    // Static field (shared for all tickets)
    static double baseFarePerKm;
    static String railwayName;
    
    // First static block: initialize base fare
    static {
        baseFarePerKm = 2.5;
        System.out.println("Static Block 1 executed: Base fare per km = " + baseFarePerKm);
    }
    // Second static block: initialize railway name
    static {
        railwayName = "National Railway";
        System.out.println("Static Block 2 executed: Railway Name = " + railwayName);
    }
    // Constructor
    Ticket(int ticketNumber, String passengerName, double distanceKm) {
        this.ticketNumber = ticketNumber;
        this.passengerName = passengerName;
        this.distanceKm = distanceKm;
    }

    // Non-static method: calculate fare for this ticket
    double calculateFare() {
        return distanceKm * baseFarePerKm;
    }

}

public class StaticBlockDemo2 {

	public static void main(String[] args) {
		  // Create few ticket objects
        Ticket t1 = new Ticket(101, "Abi", 500);
        Ticket t2 = new Ticket(102, "Thananya", 800);

        // Store tickets in array
        Ticket[] tickets = {t1, t2};

        System.out.println("\n--- Ticket Details ---");
        // Real-time calculation using for-each loop

        for (Ticket t : tickets) {
            System.out.println("Ticket Number: " + t.ticketNumber);
            System.out.println("Passenger Name: " + t.passengerName);
            System.out.println("Railway: " + Ticket.railwayName);
            System.out.println("Distance: " + t.distanceKm + " km");
            System.out.println("Total Fare: Rs. " + t.calculateFare());
            System.out.println("-------------------------");
        }
        // Access static field directly via class name
        System.out.println("Base fare per km (shared by all tickets): Rs. " + Ticket.baseFarePerKm);

	}

}
/*
Static Block 1 executed: Base fare per km = 2.5
Static Block 2 executed: Railway Name = National Railway

--- Ticket Details ---
Ticket Number: 101
Passenger Name: Abi
Railway: National Railway
Distance: 500.0 km
Total Fare: Rs. 1250.0
-------------------------
Ticket Number: 102
Passenger Name: Thananya
Railway: National Railway
Distance: 800.0 km
Total Fare: Rs. 2000.0
-------------------------
Base fare per km (shared by all tickets): Rs. 2.5
*/