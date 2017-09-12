package recitation2solution;

/**
 *
 * @author Chris Fogerty
 *
 */

public class IntegerMatrix {
	/**
	 * Number of rows in the matrix (size of IntegerVector array)
	 */
	private int rows;

	/**
	 * Number of columns in the matrix (size of each IntegerVector)
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
		//copy fields
		rows = im.rows;
		cols = im.cols;
		matrix = new IntegerVector[rows];

		//deep copy
		for(int i = 0; i < rows; ++i)
		{
			//use copy constructor
			matrix[i] = new IntegerVector(im.matrix[i]);
		}

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
		//check type
		if(obj == null || obj.getClass() != this.getClass())
			return false;

		//cast
		IntegerMatrix other = (IntegerMatrix) obj;

		//check equals
		if(rows != other.rows || cols != other.cols)
			return false;

		for(int i = 0; i < rows; ++i)
		{
			//"recursive" call
			if(!matrix[i].equals(other.matrix[i]))
				return false;
		}

		return true;
	}

	@Override
	public IntegerMatrix clone()
	{
		//deep copy
		try {
			IntegerMatrix copy = (IntegerMatrix) super.clone();

			//Object.clone() magically copies primitives
			copy.matrix = new IntegerVector[rows];

			for(int i = 0; i < rows; ++i)
			{
				copy.matrix[i] = matrix[i].clone();
			}
			return copy;
		}
		catch(CloneNotSupportedException e)
		{
			//Should never happen
			return null;
		}
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < rows; ++i)
		{
			sb.append(matrix[i].toString());

			if(i+1 < rows)
				sb.append('\n');
		}

		return sb.toString();
	}
}
