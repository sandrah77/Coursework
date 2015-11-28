/*
Create a class Matrix that has a 2-D array of integers as a field. The class should have methods for:

• a constructor method Matrix(int,int) setting the size of the array as two integers 
(not necessarily the same). All elements in the matrix should be initialised to 1.

• a method setElement(int,int,int) to modify one element of the array, given its position 
(the first two integers) and the new value to be put in that position (the third integer). 
The method must check that the indeces are valid before modifying the array to avoid an 
IndexOutOfBoundsException. If the indeces are invalid, the method will do nothing and the third 
argument will be ignored.

• a method setRow(int,String) that modifies one whole row of the array, given its position as an 
integer and the list of numbers as a String like “1,2,3”. The method must check that the index is 
valid and the numbers are correct (i.e. if the array has three columns, the String contains three 
numbers). If the index or the String is invalid, the method will do nothing.

• a method setColumn(int,String) that modifies one whole column of the array, given its position as 
an integer and the list of numbers as a String like “1,2,3”. The method must check that the index is 
valid and the numbers are correct (i.e. if the array has four rows, the String contains four numbers).
If the index or the String is invalid, the method will do nothing.

• a method toString() that returns the values in the array as a String using square brackets, commas, 
and semicolons, e.g. “[1,2,3;4,5,6;3,2,1]”.

• A method prettyPrint() that prints the values of the matrix on screen in a legible format. 
Hint: you can use the special character ’\t’ (backslash-t) to mark a tabulator so that all numbers 
are placed in the same column regardless of their size. You can think of a tabulator character as a 
move-to-the-next-column command when printing on the screen.

Create a Groovy program that uses all those methods from the Matrix class: creates matrices, 
modifies its elements (one-by-one, by rows, and by columns), and prints the matrix on the screeen.
*/

public class Matrix {
	private int[][] myMatrix; // declare a matrix of type int

	// Construct the 2-D Matrix to hold the data with given size. 
	public Matrix(int arrSize1, int arrSize2) { 
		this.myMatrix = new int[arrSize1][arrSize2];

		for (int i = 0; i < arrSize1; i++) {
			for (int j = 0; j < arrSize2; j++) {
				this.myMatrix[i][j] = 1;
			}
		}
	}

	public void setElement(int row, int col, int newValue) {
		int rowLength = this.myMatrix.length;
		int colLength = this.myMatrix.length;
		if ((row <= rowLength) && (col <= colLength)) {
				this.myMatrix[row][col] = newValue;
		}
	}	

	public void setRow(int row, String userNums) {
		int rowLength = this.myMatrix.length;
		if (row <= rowLength) { // check that the indices are within a valid length
			userNums = userNums.replaceAll("\\D+",""); // use the shorthand character class to match [0-9]
			if (userNums.length() == rowLength) {
				for (int i = 0; i < rowLength; i++) {
					this.myMatrix[row][i] = Character.getNumericValue(userNums.charAt(i));
				}
			}
		}
	}
	
	public void setColumn(int col, String userNums) {
		int colLength = this.myMatrix.length;
		if (col <= colLength) { // check that the indices are within a valid length
			userNums = userNums.replaceAll("\\D+",""); // use the shorthand character class to match [0-9]
			if (userNums.length() == colLength) {
				for (int i = 0; i < colLength; i++) {
					this.myMatrix[i][col] = Character.getNumericValue(userNums.charAt(i));
				}
			}
		}
	}	
	
	public String toString() {
		String values = "";
		 values+= "[";
		for(int i = 0; i < this.myMatrix.length; i++) {
			for (int j = 0; j < this.myMatrix[i].length; j++) {
				values = values.substring(0, values.length()-1); 
				values += "]";
			}
		}
		return values; 
	}
	
	/**
	* Print formatted matrix to console
	*/
	public void prettyPrint() {
		for (int i = 0; i < this.myMatrix.length; i++) { 
			for (int j = 0; j < this.myMatrix[j].length; j++) {
				System.out.print(this.myMatrix[i][j] + "\t");
			}
			System.out.println();
		}	 
	}
	
	public static void main (String[] args) {

	Matrix myMatrix = new Matrix(5, 5);
	System.out.println(myMatrix.toString());	
	//myMatrix.setElement(5,9,20);
	//myMatrix.setRow(0, "1,2,3");
	//myMatrix.setColumn(1, "4,5,6,7");
	//myMatrix.prettyPrint();


	}	
}