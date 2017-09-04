package rec1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class _2_JUnit_Example {

	@BeforeClass
	//This and afterClass must be static
	public static void be4Class(){
		System.out.println("-This is before class");
	}
	
	@Before
	//This runs before every test, every time a test is ran.
	public void be4(){
		System.out.println("\t-This is before");
	}
	
	@Test
	public void testEvenOdd() {
		System.out.println("\t\t-This is testEvenOdd");
		
		assertTrue(isEven("Hell"));
		assertFalse((isEven("Hello")));
	}
	
	@Test
	public void testNullObjects(){
		System.out.println("\t\t-This is testNullObjects");
		
		//Objects to test
		int[] null_array = null;
		int[] normal_array = new int[20];
		String null_string = null;
		String	normal_string = "Hello Everyone!";
		
		//Actual test of objects(With Asserts)
		assertNull(null_array);
		assertNotNull(normal_array);
		assertNull(null_string);
		assertNotNull(normal_string);
		
		//Actual Test of objects(With conditional asserts)
		assertTrue(null_array == null);
		assertFalse(normal_array == null);
	}
	
	@Test
	//Testing that a word is longer than some arbitrary length
	public void testLongWords(){
		System.out.println("\t\t-This is testLongWords");
		
		int limitLength = 7;
		String word1 = "hello";
		String word2 = "world!";
		String word3 = "unkeyboardinated";
		
		//Make sure limitLength is 7
		assertEquals(limitLength, 7);
		
		//Ensure all words are as long as they're supposed to be
		assertTrue(word1.length() < limitLength);
		assertTrue(word2.length() < limitLength);
		assertFalse(word3.length() < limitLength);
	}

	@Test
	public void testNonAlphaChars(){
		System.out.println("\t\t-This is testNonAlphaChars");
		
		//Test Strings
		String word1 = "Hello";
		String word2 = "Hell0";
		String word3 = "TryAgain";
		String word4 = "7rya9ain";
		
		//Test with Assert Equals
		assertEquals(true, isAlpha(word1));
		assertEquals(false, isAlpha(word2));
		assertEquals(true, isAlpha(word3));
		assertEquals(false, isAlpha(word4));
		
		//Test with assertTrue and AssertFalse
		assertTrue(isAlpha(word1));
		assertFalse(isAlpha(word2));
		assertTrue(isAlpha(word3));
		assertFalse(isAlpha(word4));
		
	}
	
	@After
	//This runs after every test
	public void after(){
		System.out.println("\t-This is After");
	}
	
	@AfterClass
	//This runs after the whole class has been ran
	public static void afterClass(){
		System.out.println("-This is AfterClass");
	}
	
	private boolean isAlpha(String word){
		word = word.toLowerCase();
		for(int i = 0; i < word.length(); i++){
			if(word.charAt(i) > 'z' || word.charAt(i) < 'a')
				return false;
		}
		
		return true;
	}
	
	private boolean isEven(String word){
		return word.length() % 2 == 0;
	}
}
