package myjavademos;
/*
 * Each fancy item stores many fields in a 2D array:

[item][ price , quantity , GST amount , final amount ]

 */
public class ArraysDemo3 {

	public static void main(String[] args) {
        // Multi-dimensional array initialization
        double[][] items = {
            {250, 4, 0, 0},   // Gift Box
            {150, 6, 0, 0},   // Balloons
            {500, 2, 0, 0}    // Decorative Lights
        };
        double gstPercent = 12;

        System.out.println("Fancy Store Bill Details:");

        // Enhanced for loop ONLY
        for (double[] item : items) {

            double price = item[0];
            double quantity = item[1];

            double total = price * quantity;
            double gstAmount = total * gstPercent / 100;
            double finalAmount = total + gstAmount;

            // Storing calculated values back
            item[2] = gstAmount;
            item[3] = finalAmount;

   System.out.println("Price: ₹" + price +", Quantity: " + (int)quantity +", GST: ₹" + gstAmount +", Final Amount: ₹" + finalAmount);
        }
	}

}
