package myjavademos;
/*
 * 
Real-time analogy

Instance method (non-static): Imagine two phones with different ringtones. 
If you pick up a phone (the actual phone object), it rings according to the real phone type.

Static method: Imagine a public announcement that comes from the company name on the letterhead. 
The content depends on the paper you hold, not the real office behind it.

✅ Key takeaway

Non-static methods → true overriding → dynamic polymorphism.

Static methods → cannot be overridden, only hidden → resolved at compile-time.

 */
class Furniture {
    // Instance method
    void use() {
        System.out.println("Furniture is used for general purposes.");
    }

    // Static method
    static void materialInfo() {
        System.out.println("Furniture is usually made of wood or metal.");
    }
}


class Chair extends Furniture {
    @Override
    void use() {
        System.out.println("Chair is used for sitting.");
    }

    //@Override=>compilation error, static methods cannot be overridden
    static void materialInfo() {
        System.out.println("Chairs are made of wood, plastic, or metal.");
    }
}
class Table extends Furniture {
    @Override
    void use() {
        System.out.println("Table is used for placing items or dining.");
    }

    //@Override=>compilation error, static methods cannot be overridden
    static void materialInfo() {
        System.out.println("Tables are made of wood, glass, or metal.");
    }
}


public class StaticOverridingDemo1 {

	public static void main(String[] args) {
        // Polymorphic array
        Furniture[] store = {
            new Chair(),
            new Table(),
            new Chair(),
            new Furniture()
        };


        System.out.println("=== Furniture Usage Report ===");
        for (Furniture item : store) {
            item.use(); // Polymorphic call (instance method)
        }

        System.out.println("\n=== Material Information ===");
        for (Furniture item : store) {
            // Static method call resolved by reference type
            item.materialInfo();//
            //Resolved at compile-time based on reference type → item.materialInfo() always calls Furniture version.

        }
        
        System.out.println("\n=== Direct Class Material Info ===");
        Chair.materialInfo();
        Table.materialInfo();
        Furniture.materialInfo();


	}

}
/*
=== Furniture Usage Report ===
Chair is used for sitting.
Table is used for placing items or dining.
Chair is used for sitting.
Furniture is used for general purposes.

=== Material Information ===
Furniture is usually made of wood or metal.
Furniture is usually made of wood or metal.
Furniture is usually made of wood or metal.
Furniture is usually made of wood or metal.

=== Direct Class Material Info ===
Chairs are made of wood, plastic, or metal.
Tables are made of wood, glass, or metal.
Furniture is usually made of wood or metal.
*/