package exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _1_Checked_Unchecked_Ex {
	public static void main(String[] args){
		example_0();
	}

	private static void example_0(){
		File file = new File("src/exception_handling/example.txt");
//		Scanner in = new Scanner(file);
//		while(in.hasNextLine())
//			System.out.println(in.nextLine());
	}
}
