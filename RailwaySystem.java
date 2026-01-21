package mydemos;

import static mydemos.RailwayUtils.BASE_FARE_PER_KM;
import static mydemos.RailwayUtils.calculateFare;
public class RailwaySystem {

	public static void main(String[] args) {
		 Train t1 = new Train(101, "Express", 500, 80);
	        Train t2 = new Train(102, "Superfast", 800, 100);

	        Train[] trains = {t1, t2};

	        for (Train t : trains) 
	        {

	            System.out.println("Train: " + t.trainName);
	            System.out.println("Distance: " + t.distanceKm + " km");
	            System.out.println("Speed: " + t.speedKmph + " km/h");
	            System.out.println("Travel Time: " + t.calculateTravelTime() + " hours");

	        //System.out.println("Base Fare per km: " +RailwayUtils.BASE_FARE_PER_KM);//valid-dont want this one
	         
	            // Using import static to call static members without class name
	            System.out.println("Base Fare per km: " + BASE_FARE_PER_KM);
	            System.out.println("Total Fare: " + calculateFare(t.distanceKm));
	            System.out.println("-----------------------------");
	       
	        }
	
	}

}
/*
Train: Express
Distance: 500.0 km
Speed: 80.0 km/h
Travel Time: 6.25 hours
Base Fare per km: 2.5
Total Fare: 1250.0
-----------------------------
Train: Superfast
Distance: 800.0 km
Speed: 100.0 km/h
Travel Time: 8.0 hours
Base Fare per km: 2.5
Total Fare: 2000.0
-----------------------------
*/