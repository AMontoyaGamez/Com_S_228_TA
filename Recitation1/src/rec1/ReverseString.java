package rec1;

/**
 *	A class that takes in a word and prints out the reverse of it. 
 *
 * @author Justin Derby
 *
 */
public class ReverseString {

	/**
	 * Main method that reverses a hardcoded word
	 * (Could you use System.in to enter a word?)
	 *
	 * @param args Command arguments
	 */
	public static void main(String[] args) {
		// Word to reverse
		char[] word = args[0].toCharArray(); //"racecar".toCharArray();
		
		// Reverse word
		reverseString(word);
		
		// SOP the word
		printCharArray(word);
	}

	/**
	 * Returns the reversed string
	 *
	 * @param arr String to reverse
	 * @throws NullPointerException
	 * @return Reversed string
	 */
	private static char[] reverseString(char[] arr)
	{
		// Store the length of the string
		int length = arr.length;
		
		//Reverse it!
		for(int i = 0; i < length; ++i)
		{
			char temp = arr[i];
			arr[length - i] = temp;
			arr[i] = arr[length - i];
		}
		
		return arr;
	}
	
	/**
	 * Prints the char array to the console
	 *
	 * @param arr char array to print out
	 */
	private static void printCharArray(char[] arr)
	{
		System.out.println(arr.toString());
	}
}