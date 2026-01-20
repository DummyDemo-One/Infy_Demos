package myjavademos;
/*
 * If local variable name = instance variable name → this keyword is mandatory
If names are different → this keyword is optional
 */
public class ThisKeywordDemo {
	 	int accNo;
	    String name;
	    double balance;
	    
	    // 🔸 Method WITHOUT this keyword
	    void setDetails(int a, String n, double b) 
	    {
	        accNo = a;      // no confusion (different names)
	        name = n;
	        balance = b;
	    }
	    // 🔸 Method WITH this keyword
	    void setBasicDetails(int accNo, String name) {
	        this.accNo = accNo;   // same name → this is required
	        this.name = name;
	        this.balance = 0;
	    }
	    void display() {
	        System.out.println(accNo + " " + name + " " + balance);
	    }

	public static void main(String[] args) {
		ThisKeywordDemo acc1 =new ThisKeywordDemo();
		ThisKeywordDemo acc2 =new ThisKeywordDemo();
		
		 // WITHOUT this
        acc1.setDetails(201, "Ravi", 8000);

        // WITH this
        acc2.setBasicDetails(202, "Anu");

        acc1.display();
        acc2.display();
	}

}
/*
201 Ravi 8000.0
202 Anu 0.0
*/