package mydemos;
//NO MAIN METHOD
public class RailwayUtils {

	static double BASE_FARE_PER_KM = 2.5;

    // Static method: calculate fare
	static double calculateFare(double distance) {
        return distance * BASE_FARE_PER_KM;
    }

}
