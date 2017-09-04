package rec1;
import java.util.Random;
/*
 * 
	-Perspectives
	-Play vs bug Button
	-Setting BreakPoints
		*Regular
		*Conditional
	-Step in/Over/Return at breakpoint
	-Inspecting Variables
	-Watching Variables
	-Editing Variables
	-Resuming Execution
*/

public class _1_Debug_Example {

	public static void main(String[] args) {
		//ex0 - Perspectives
		
		//ex1 - Run vs Bug Button
		System.out.println("Welcome to Com S 228!");
		
		//ex2 - Toolbar Buttons
		ex2();
		
		//ex3 - Setting BreakPoints(Regular and Conditional)
//		ex3();
		
		//ex4 - Inspecting Variables/Editing Variables
//		ex4();
		
		//ex5 - Watching Variables
//		ex5();
		
		//ex6 - Stop Programs after running.
	}
	
	public static void ex2(){
		int num1 = retNum1();
		int num2 = retNum2();
		
		System.out.println(num1);
		System.out.println(num2);
		
		//Suspend Button
		int s = 20;
		while(s==s)
			s++;
	}
	
	public static int retNum1(){
		return 1 * retNumHelper();
	}
	
	public static int retNum2(){
		return 2 * retNumHelper();
	}

	private static int retNumHelper() {
		return 10;
	}
	
	public static void ex3(){
		int[] arr = new int[20];
		for(int i = 0; i < arr.length; i++){
			arr[i] = i;
			System.out.println(arr[i]);
		}
	}
	
	//ex4 - Inspecting Variables/Editing Variables
	public static void ex4(){
		int[] randArr = new int[20];
		Random r = new Random();
		for(int i = 0; i < randArr.length; i++){
			randArr[i] = r.nextInt(100);
		}
		System.out.println(randArr[10]);
	}
	
	//ex5 - Watching Variables
	private static void ex5() {
		int foo1 = 4;
		int foo2 = 9;
		int foo3 = 16;
		int foo4 = 25;
		int foo5 = 36;
		int foo6 = 49;
		int foo7 = 64;
		int foo8 = 81;
		int foo9 = 100;
		int foo10 = 121;
		int baz1 = 144;
		int baz2 = 169;
		int baz3 = 196;
		int baz4 = 225;
		int baz5 = 256;
		int baz6 = 289;
		int baz7 = 324;
		int baz8 = 361;
		int baz9 = 400;
		int baz10 = 441;
		int bar1 = 484;
		int bar2 = 529;
		int bar3 = 576;
		int bar4 = 625;
		int bar5 = 676;
		int bar6 = 729;
		int bar7 = 784;
		int bar8 = 841;
		int bar9 = 900;
		int bar10 = 961;
		System.out.println(bar9);
	}
}

