package Try_Catch;

import java.io.FileNotFoundException;

public class _0_Try_Catch {
	public static void main(String[] args) {
//		example_0();
		example_1();
	}

	public static void example_0(){
		int[] arr = null;
		//arr = new int[10];
		arr[0] = 1;//NullPointerException(Fix)
		arr = new int[20];
		arr[20] = 0;//ArrayOUtOboundsException
	}
	
	public static void example_1(){
		try{
			int[] arr = null;
			//arr = new int[10];
			arr[0] = 1;//NullPointerException(Fix)
			arr = new int[20];
			arr[20] = 0;//ArrayOUtOboundsException
		}
		catch(NullPointerException null_exception){
			System.out.println("You've had a null pointer exception");
		}
		catch(ArrayIndexOutOfBoundsException out_of_bounds_exception){
			System.out.println("You've had an OutOfBounds Exception, FIX IT!");
		}
		finally{
			System.out.println("finally block will run NO MATTER WHAT!");
		}
	}
	
	
}
