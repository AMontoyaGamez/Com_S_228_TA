package copy_clone;

/**
 * 
 * @author Chris Fogerty
 *
 */

public class IntegerMatrix {
	/**
	 * Number of rows in the matrix (size of IntegerVector 
	 * array)
	 */
	private int rows;
	
	/**
	 * Number of columns in the matrix (size of each 
	 * IntegerVector)
	 */
	private int cols;
	
	/**
	 * The matrix
	 */
	private IntegerVector[] matrix;
	
	/**
	 * Constructs a zero rows x cols matrix
	 * @param rows number of rows
	 * @param cols number of cols
	 * @throws IllegalArgumentException
	 * 				if rows or cols is less than or equal to 0
	 */
	public IntegerMatrix(int rows, int cols)
	{
		if(rows <= 0 || cols <= 0)
			throw new IllegalArgumentException();
		
		this.rows = rows;
		this.cols = cols;
		matrix = new IntegerVector[rows];
		
		for(int i = 0; i < rows; ++i)
		{
			matrix[i] = new IntegerVector(cols);
		}
	}
	
	/**
	 * constructs a deep copy of the given matrix
	 * @param im an existing IntegerMatrix to be copied
	 */
	public IntegerMatrix(IntegerMatrix im)
	{
		//deep copy
		//TODO
	}
	
	/**
	 * Returns the integer at postion (row, col)
	 * @param row the row to retrieve
	 * @param col the column to retrieve
	 * @return the integer at the given position
	 */
	public int get(int row, int col)
	{
		return matrix[row].get(col);
	}
	
	/**
	 * Sets the integer at the given index to the given value
	 * @param row the row
	 * @param col the column
	 * @param val the new value
	 */
	public void set(int row, int col, int val)
	{
		matrix[row].set(col, val);
	}
	
	/**
	 * @return the number of rows in the matrix
	 */
	public int rowDim()
	{
		return rows;
	}
	
	/**
	 * @return the number of columns in the matrix
	 */
	public int colDim()
	{
		return cols;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		//TODO
		//check type
		
		//cast
		
		//check equals
	}
	
	@Override
	public IntegerMatrix clone()
	{
		//TODO
		//deep copy
	}
	
	@Override
	public String toString()
	{
		//TODO
	}
}
