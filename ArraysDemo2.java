package myjavademos;
/*
 * What is a Multidimensional Array?

An array that contains more than one dimension.

Think of it as an array of arrays.

Most common: 2D array → rows and columns (like a table or spreadsheet).

Syntax:

datatype[][] arrayName = new datatype[rows][columns];
 * 
 * Seating => Booking system for theaters (rows × columns)
 */
public class ArraysDemo2 {

	public static void main(String[] args) {
		int[][] k= 
			{
				{1,2,4},
				{56,87,45,576,76767},
				{45,76,5656}				
			};;//row 3 column size vary!In array initialization,new keyword is optional
		
			int[] k2[]= 
				{
					{1,2,4},
					{56,87,45,576,76767},
					{45,76,5656}				
				};	//row 3 column size vary!In array initialization,new keyword is optional


			int[][] k1= new int[][]
					{
				{1,2,4},
				{56,87,45,576,76767},
				{45,76,5656}				
					};//row 3 column size vary!

					//nested for loop
					for(int i=0;i<k.length;i++)//row size==3
					{
						//k[0].length=3
						//k[1].length=5
						//k[2].length=3
						for(int j=0;j<k[i].length;j++)//column size
						{
							System.out.print(k[i][j]+ " ");
							
						}
						System.out.println();//next row							
					}

					//nested for each loop
					System.out.println("2D array:: For each loop:: ");

					for(int i[]:k1)//convert 2d to 1d
					{
						for(int j:i)//convert 1d to printing
						{
							System.out.print(j + " ");
						}
						System.out.println();//next row
						
					}

	}

}
/*
1 2 4 
56 87 45 576 76767 
45 76 5656 
2D array:: For each loop:: 
1 2 4 
56 87 45 576 76767 
45 76 5656 
*/