package myjavademos;
/*
 * Bookstore

Each book in a bookstore has:

Book Name
Author
Price
Discount
GST
Final Price

Requirements:

Private fields for security (encapsulation)
Accessed and updated only through getters and setters
Business logic like GST & final price calculation handled internally

 */
class Book {

    // Private variables (Encapsulation)
    private String bookName;
    private String author;
    private double price;
    private double discount;
    private double gst;
    private double finalPrice;
  //Rightclick->Source->Generate Getters and Setters 
    public String getBookName() {
		return bookName;
	}
	public String getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	public double getDiscount() {
		return discount;
	}
	public double getGst() {
		return gst;
	}
	public double getFinalPrice() {
		return finalPrice;
	}
	

    // ✅ Public Setter Methods
    public void setPrice(double price) {
        if(price >= 0) {
            this.price = price;
            calculateFinalPrice(); // recalc final price
        }
    }

    public void setDiscount(double discount) {
        if(discount >= 0 && discount <= price) {
            this.discount = discount;
            calculateFinalPrice(); // recalc final price
        }
    }

	// Constructor
    public Book(String bookName, String author, double price, double discount) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.discount = discount;
        calculateFinalPrice(); // Internal logic
    }
    

    // Private method to calculate GST and final price
    private void calculateFinalPrice() 
    {
        gst = (price - discount) * 5 / 100; // GST 5%
        finalPrice = price - discount + gst;
    }

    // Display Book Details
    public void displayBook() {
        System.out.println("\nBook Name   : "+getBookName());
        System.out.println("Author      : " + getAuthor());
        System.out.println("Price       : ₹" + getPrice());
        System.out.println("Discount    : ₹" + getDiscount());
        System.out.println("GST (5%)    : ₹" + getGst());
        System.out.println("Final Price : ₹" + getFinalPrice());
   }
}
public class EncapsulationGetterSetterDemo {

	public static void main(String[] args) {
	       // Create book object
        Book b1 = new Book("Java Programming", "Karthik", 500, 50);

        // Accessing private variables using public getter
        System.out.println("Book Price: ₹" + b1.getPrice());


        // Updating private variables using public setter
        b1.setDiscount(100); // discount updated
        
        // Display updated details
        b1.displayBook();


	}

}
/*
Book Price: ₹500.0

Book Name   : Java Programming
Author      : Karthik
Price       : ₹500.0
Discount    : ₹100.0
GST (5%)    : ₹20.0
Final Price : ₹420.0
*/
/*

Encapsulation: Hiding private variables and exposing controlled access.

Getter: Provides read-only access.

Setter: Provides controlled write access.

Advantage: Protects data and enforces business rules.
*/