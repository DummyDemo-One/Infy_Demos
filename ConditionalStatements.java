package myjavademos;
/*
 * | Type               | Operator     | Meaning              | Example                      | Output    |        |   |         |      |
| ------------------ | ------------ | -------------------- | ---------------------------- | --------- | ------ | - | ------- | ---- |
| **Arithmetic**     | `+`          | Addition             | `5 + 3`                      | 8         |        |   |         |      |
|                    | `-`          | Subtraction          | `5 - 3`                      | 2         |        |   |         |      |
|                    | `*`          | Multiplication       | `5 * 3`                      | 15        |        |   |         |      |
|                    | `/`          | Division             | `10 / 2`                     | 5         |        |   |         |      |
|                    | `%`          | Modulus              | `10 % 3`                     | 1         |        |   |         |      |
| **Unary**          | `+`          | Unary plus           | `+5`                         | 5         |        |   |         |      |
|                    | `-`          | Unary minus          | `-5`                         | -5        |        |   |         |      |
|                    | `++`         | Increment            | `i++ / ++i`                  | i+1       |        |   |         |      |
|                    | `--`         | Decrement            | `i-- / --i`                  | i-1       |        |   |         |      |
|                    | `!`          | Logical NOT          | `!true`                      | false     |        |   |         |      |
| **Relational**     | `==`         | Equal to             | `5 == 5`                     | true      |        |   |         |      |
|                    | `!=`         | Not equal            | `5 != 3`                     | true      |        |   |         |      |
|                    | `>`          | Greater than         | `5 > 3`                      | true      |        |   |         |      |
|                    | `<`          | Less than            | `5 < 3`                      | false     |        |   |         |      |
|                    | `>=`         | Greater/equal        | `5 >= 5`                     | true      |        |   |         |      |
|                    | `<=`         | Less/equal           | `5 <= 3`                     | false     |        |   |         |      |
| **Logical**        | `&&`         | AND                  | `(true && false)`            | false     |        |   |         |      |
|                    | `            |                      | `                            | OR        | `(true |   | false)` | true |
|                    | `!`          | NOT                  | `!true`                      | false     |        |   |         |      |
| **Assignment**     | `=`          | Assign               | `i = 5`                      | 5         |        |   |         |      |
|                    | `+=`         | Add & assign         | `i += 3`                     | i = i + 3 |        |   |         |      |
|                    | `-=`         | Subtract & assign    | `i -= 3`                     | i = i - 3 |        |   |         |      |
|                    | `*=`         | Multiply & assign    | `i *= 2`                     | i = i * 2 |        |   |         |      |
|                    | `/=`         | Divide & assign      | `i /= 2`                     | i = i / 2 |        |   |         |      |
|                    | `%=`         | Modulus & assign     | `i %= 3`                     | i = i % 3 |        |   |         |      |
| **Bitwise**        | `&`          | AND                  | `5 & 3`                      | 1         |        |   |         |      |
|                    | `            | `                    | OR                           | `5        | 3`     | 7 |         |      |
|                    | `^`          | XOR                  | `5 ^ 3`                      | 6         |        |   |         |      |
|                    | `~`          | NOT                  | `~5`                         | -6        |        |   |         |      |
|                    | `<<`         | Left shift           | `5 << 1`                     | 10        |        |   |         |      |
|                    | `>>`         | Right shift          | `5 >> 1`                     | 2         |        |   |         |      |
|                    | `>>>`        | Unsigned right shift | `5 >>> 1`                    | 2         |        |   |         |      |
| **Ternary**        | `? :`        | Conditional          | `(marks>=50)? "Pass":"Fail"` | Pass      |        |   |         |      |
| **Instance Check** | `instanceof` | Check object type    | `str instanceof String`      | true      |        |   |         |      |

 */
public class ConditionalStatements {
	//class is EMPTY->NO OBJECT

	public static void main(String[] args) {
		// RELATIONAL or COMPARISON OPERATORS::>,>=,<,<=,==,!=
		//Inner if executes only if the outer if condition is true.
				if (12 > 2)
				{
					if (34 < 2) 
					{
						System.out.println("Inner If block is bigger!");
					} 
					else {
						System.out.println("Inner if..else block");
					}
				} else {
					System.out.println("Over!!");
				}


				double balance = 5000;
				double withdrawAmount = 2000;
				boolean pinCorrect = true;

				if (pinCorrect) {
				    if (balance >= withdrawAmount) {
				        System.out.println("Withdrawal Successful");
				    } else {
				        System.out.println("Insufficient Balance");
				    }
				} else {
				    System.out.println("Incorrect PIN");
				}

				//The if-else if ladder is used when you have multiple conditions and only one block should execute.
				
				String signal = "Yellow";

				if (signal.equals("Green")) {
				    System.out.println("Go");
				} else if (signal.equals("Yellow")) {
				    System.out.println("Slow Down");
				} else if (signal.equals("Red")) {
				    System.out.println("Stop");
				} else {
				    System.out.println("Invalid Signal");
				}
				
				// while loop=>ENTRY CONTROLLED LOOP
				int i = 1;
				while (i <= 6) {
					System.out.print(i + " ");
					i++;
				}

				//STOCK INVENTORY CHECK
				
				int stock = 10;

				while (stock > 0) {
				    System.out.println("Item sold, remaining stock: " + stock);
				    stock--; // decrease stock by 1
				}
				System.out.println("Stock empty! Reorder required.");
	
				//dowhile loop=>EXIT CONTROLLED LOOP
				int j=100;
				do
				{
					System.out.print("\n"+j);
					j++;
				}while(j>=150);


				   int cup = 1;         // first cup
			        int totalCups = 4;   // total cups to serve

			        do {
			            System.out.println("Serving coffee cup #" + cup);
			            cup++;
			        } while (cup <= totalCups);

			        System.out.println("All coffee cups served!");
			        

					System.out.println();// newline
					
					//for loop
					for(int k=0;k<=5;k++)
					{
						System.out.print(" "+k);
					}
					
					int totalItems = 4;
			        for (int item = 1; item <= totalItems; item++) {
			            System.out.println("Adding Item #" + item + " to the cart");
			        }
			        System.out.println("All items added to cart!");

			        System.out.println("For Loop Without Increment::");
					int k=1;
					for(k=2;k<=5;)
					{
						System.out.print(k+ " ");
						k++;
					}

					System.out.println("\nFor Loop Contains SOP");
					//{} IS MISSING INSTEAD OF THAT ;
					for(int j1=1;j1<=5;System.out.print(" "+j1++));
					
					System.out.println();
					
					for(int y1=-1,y2=51;y1<=5&&y2>0;y1++,y2--)
					{
						System.out.println(y1+ " "+y2);
					}

					System.out.println("Break Keyword::");
					for(int u1=1;u1<=5;u1++)
					{
					if (u1==3)			
					{
						break;//terminate the current loop
					}
					System.out.print(u1 + " ");
					}
					System.out.println("Stop!");
					
					
					 int correctPin = 1234;

				        for (int attempt = 1; attempt <= 3; attempt++) {

				            int enteredPin = 111111; // wrong PIN (simulated)

				            if (enteredPin == correctPin) {
				                System.out.println("PIN correct. Access granted.");
				                break;
				            } else {
				                System.out.println("Wrong PIN. Attempt " + attempt);
				            }

				            if (attempt == 3) {
				                System.out.println("Card blocked. Too many wrong attempts.");
				                break; // stop ATM process
				            }
				        }
					
				    	/*
						 * difference between break and continue is that the break exits a loop at once. 
						 * Once a break statement is executed, the loop will not run again. 
						 * However, after executing the continue statement, the following lines of code will be 
						 * skipped for the current iteration only. The loop will begin to execute again.
						 * 
						 * 
						 * break → stop everything

							continue → skip this and move on
						 */

						System.out.println("Continue Keyword::");
						for(int u1=1;u1<=5;u1++)
						{
						if (u1==3)			
						{
							continue;//skip the remaining part of the loop but continue the iteration
						}
						System.out.print(u1 + " ");
						}
						System.out.println("Done!");
//If a car does not have FASTag, automatic toll collection is skipped and the next car is checked.

						for (int car = 1; car <= 5; car++) {

						    boolean hasFastTag = (car != 2); // car 2 has no FASTag

						    if (!hasFastTag) {
						        continue;   // skip this car
						    }

						    System.out.println("Toll collected from car " + car);
						}
	
						//Ambulance / 🚒 Fire truck passes without toll.
						for (int car = 1; car <= 5; car++) {

						    boolean isEmergencyVehicle = (car == 4);

						    if (isEmergencyVehicle) {
						        continue;   // skip toll collection
						    }

						    System.out.println("Toll charged for car " + car);
						}
						
						//conditional operator or ternary operator(?:)
						//alternative of if..else

						int r=40,y=20;
						String res=(r>y)?r+ " is bigger ":y+ " is smaller";
						System.out.println("Ternary:: "+res);
						
						String paymentMode = "UPI";
						String cashback = paymentMode.equals("CARD") ? "Cashback Applied" : "No Cashback";
						System.out.println(cashback);

						/*
						 * rule:

Marks ≥ 50 → Pass

Marks 35–49 → Reappear

Marks < 35 → Fail
						 */
						int marks = 42;

						String result =
						        marks >= 50 ? "Pass"
						        : marks >= 35 ? "Reappear"
						        : "Fail";

						System.out.println(result);

						//nested ternary operator
						int a4=78,b4=734,c4=400,largest;
						largest=a4>b4?(a4>c4?a4:c4):(b4>c4?b4:c4);
						System.out.println("Largest:"+largest);


						/*
						 * Switch case::
						 * --Menu based model
						 * --looks like if..else
						 * --byte,short,int,char,String supported
						 * --case value must be unique
						 * --float and double are not supported
						 * --default block is optional
						 */
						int paymentMode1 = 3111; // 1=Cash, 2=Card, 3=UPI, 4=Wallet

						switch(paymentMode1) {
						    case 1:
						        System.out.println("Payment via Cash");
						        break;
						    case 2:
						        System.out.println("Payment via Card");
						        break;
						    case 3:
						        System.out.println("Payment via UPI");
						        break;
						    case 4:
						        System.out.println("Payment via Wallet");
						        break;
						    default:
						        System.out.println("Invalid Payment Option");
						}
						
						 // Directly assigning choices
				        int category = 21;       // 1=Electronics, 2=Grocery, 3=Clothing
				        int item = 2;           // Depends on category
				        switch(category) {
				            case 1: // Electronics
				                System.out.println("Category: Electronics");

				                switch(item) {
				                    case 1: System.out.println("Item: Phone | Price: ₹25,000"); break;
				                    case 2: System.out.println("Item: Laptop | Price: ₹55,000"); break;
				                    case 3: System.out.println("Item: Headphones | Price: ₹2,500"); break;
				                    default: System.out.println("Invalid Electronics Item"); 
				                }
				                break;

				            case 2: // Grocery
				                System.out.println("Category: Grocery");

				                switch(item) {
				                    case 1: System.out.println("Item: Rice | Price: ₹500"); break;
				                    case 2: System.out.println("Item: Oil | Price: ₹200"); break;
				                    case 3: System.out.println("Item: Milk | Price: ₹60"); break;
				                    default: System.out.println("Invalid Grocery Item"); 
				                }
				                break;

				            case 3: // Clothing
				                System.out.println("Category: Clothing");

				                switch(item) {
				                    case 1: System.out.println("Item: T-Shirt | Price: ₹600"); break;
				                    case 2: System.out.println("Item: Jeans | Price: ₹1,200"); break;
				                    case 3: System.out.println("Item: Jacket | Price: ₹2,000"); break;
				                    default: System.out.println("Invalid Clothing Item"); 
				                }
				                break;

				            default:
				                System.out.println("Invalid Category");
				        }
				        
				        int no=10;
						String rating="";
						switch(no)
						{
						default:
							System.out.println("Invalid option!");
							break;
						case 8:
								rating="good";
								break;
						case 10://2 case contains same logic
							//empty case!!!no break keyword
						case 20:
								rating="Excellent";
								break;
								
						
						case 10333:
							rating="Nice";
							break;						
					}
					System.out.println("Rating:: "+rating);

	}

	
}
/*
Inner if..else block
Withdrawal Successful
Slow Down
1 2 3 4 5 6 Item sold, remaining stock: 10
Item sold, remaining stock: 9
Item sold, remaining stock: 8
Item sold, remaining stock: 7
Item sold, remaining stock: 6
Item sold, remaining stock: 5
Item sold, remaining stock: 4
Item sold, remaining stock: 3
Item sold, remaining stock: 2
Item sold, remaining stock: 1
Stock empty! Reorder required.

100Serving coffee cup #1
Serving coffee cup #2
Serving coffee cup #3
Serving coffee cup #4
All coffee cups served!

 0 1 2 3 4 5Adding Item #1 to the cart
Adding Item #2 to the cart
Adding Item #3 to the cart
Adding Item #4 to the cart
All items added to cart!
For Loop Without Increment::
2 3 4 5 
For Loop Contains SOP
 1 2 3 4 5
-1 51
0 50
1 49
2 48
3 47
4 46
5 45
Break Keyword::
1 2 Stop!
Wrong PIN. Attempt 1
Wrong PIN. Attempt 2
Wrong PIN. Attempt 3
Card blocked. Too many wrong attempts.
Continue Keyword::
1 2 4 5 Done!
Toll collected from car 1
Toll collected from car 3
Toll collected from car 4
Toll collected from car 5
Toll charged for car 1
Toll charged for car 2
Toll charged for car 3
Toll charged for car 5
Ternary:: 40 is bigger 
No Cashback
Reappear
Largest:734
Invalid Payment Option
Invalid Category
Rating:: Excellent
*/