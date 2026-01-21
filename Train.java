package mydemos;
//NO MAIN METHOD
class Train {

	    int trainNumber;
	    String trainName;
	    double distanceKm; // distance for journey in km
	    double speedKmph;  // current speed of train

	    Train(int trainNumber, String trainName, double distanceKm, double speedKmph) {
	        this.trainNumber = trainNumber;
	        this.trainName = trainName;
	        this.distanceKm = distanceKm;
	        this.speedKmph = speedKmph;
	    }

	    // Non-static method: calculate travel time
	    double calculateTravelTime() {
	        return distanceKm / speedKmph; // time in hours
	    }

}
