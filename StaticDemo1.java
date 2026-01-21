package myjavademos;

/*
 * | Feature          | `static`                             | `non-static` (instance)           |
| ---------------- | ------------------------------------ | --------------------------------- |
| Belongs to       | Class                                | Object                            |
| Accessed by      | `ClassName.variableOrMethod()`       | `object.variableOrMethod()`       |
| Memory           | Loaded once in memory                | New copy for each object          |
| Shared?          | ✅ Yes (shared by all objects)        | ❌ No (unique to each object)      |
| Requires object? | ❌ No                                 | ✅ Yes                             |
| Common use cases | Constants, utility methods, counters | Object-specific data and behavior |

 */
class Counter
{
	//int count;//non static data member=>default value is 0
	/*
	 * Static variables are shared among all instances of a class.
	 *  Non static variables are specific to that instance of a class. 
	 */
	//static variable(class variable)
	 static int count;//default value is 0

	public Counter()//DEFAULT CONSTRUCTOR
		{
			count++;
		}
			public int totalhits()
			{
				return count;
			}
}
public class StaticDemo1 {
	public static void main(String[] args) {

		/* Counter c1=new Counter();	
			System.out.println("Count:: "+c1.totalhits());
			Counter c2=new Counter();
			System.out.println("Count:: "+c2.totalhits());
			Counter c3=new Counter();
			System.out.println("Count:: "+c3.totalhits());
Count:: 1
Count:: 2
Count:: 3

*/
		Counter c1=new Counter();//1
		Counter c2=new Counter();//2
		Counter c3=new Counter();//3
		System.out.println("Count:: "+c1.totalhits());
		System.out.println("Count:: "+c2.totalhits());
		System.out.println("Count:: "+c3.totalhits());

		/*
		 * Count:: 3
Count:: 3
Count:: 3
*/


	}

}
