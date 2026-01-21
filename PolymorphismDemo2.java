package myjavademos;


class Product1 {
    String name;
    double price;

    public Product1(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double calculateSales(int quantity) {
        return price * quantity; // default calculation
    }
}
class Book1 extends Product1 {
    int pages;

    public Book1(String name, double price, int pages) {
        super(name, price);
        this.pages = pages;
    }

    @Override//Properly Override the parent class method
    public double calculateSales(int quantity) {
        return price * quantity; // simple book calculation
    }
}
class Electronics extends Product1 {
    int warrantyYears;

    public Electronics(String name, double price, int warrantyYears) {
        super(name, price);
        this.warrantyYears = warrantyYears;
    }

    @Override
    public double calculateSales(int quantity) {
        return price * quantity * 1.10; // add 10% for warranty/tax
    }
}

class Clothing extends Product1 {
    String size;

    public Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public double calculateSales(int quantity) {
        // 5% discount if quantity > 3
        if (quantity > 3) {
            return price * quantity * 0.95;
        } else {
            return price * quantity;
        }
    }
}



public class PolymorphismDemo2 {

	public static void main(String[] args) {    
		Product1[] products = new Product1[] {
            new Book1("C# in Depth", 40.0, 900),
            new Book1("Algorithms", 30.0, 500),
            new Electronics("Smartphone", 600.0, 2),
            new Electronics("Laptop", 1200.0, 3),
            new Clothing("T-Shirt", 20.0, "M"),
            new Clothing("Jacket", 120.0, "XL")
            };
            
            int[] quantitiesSold = {2, 5, 3, 1, 4, 2}; // different quantity per product

            double grandTotal = 0.0;

            System.out.println("---- Product Sales Report ----\n");

            for (int i = 0; i < products.length; i++) {
                Product1 p = products[i];
                int quantity = quantitiesSold[i];

                double sales = p.calculateSales(quantity);
                grandTotal += sales; // accumulate grand total

                System.out.println(p.name + " sales for " + quantity + " units: $" + String.format("%.2f", sales));

//               Casting (instanceof) used to print subclass-specific fields.


                if (p instanceof Book1) {
                    Book1 b = (Book1) p;  // Manual Object casting after instanceof check
                    System.out.println("Book pages: " + b.pages);
                } else if (p instanceof Electronics) {
                    Electronics e = (Electronics) p;
                    System.out.println("Warranty: " + e.warrantyYears + " years");
                } else if (p instanceof Clothing) {
                    Clothing c = (Clothing) p;
                    System.out.println("Clothing size: " + c.size);
                }

                System.out.println();
                System.out.println("Grand Total Sales: $" + String.format("%.2f", grandTotal));

            }
        


	}

}
/*
---- Product Sales Report ----

C# in Depth sales for 2 units: $80.00
Book pages: 900

Grand Total Sales: $80.00
Algorithms sales for 5 units: $150.00
Book pages: 500

Grand Total Sales: $230.00
Smartphone sales for 3 units: $1980.00
Warranty: 2 years

Grand Total Sales: $2210.00
Laptop sales for 1 units: $1320.00
Warranty: 3 years

Grand Total Sales: $3530.00
T-Shirt sales for 4 units: $76.00
Clothing size: M

Grand Total Sales: $3606.00
Jacket sales for 2 units: $240.00
Clothing size: XL

Grand Total Sales: $3846.00
*/