package Inheritance;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;

public class instanceof_getClass {

	@Test
	public void testInstanceof1() {
		String s = "Hello, World";
		assertTrue(s instanceof String);
	}

	@Test
	public void testInstanceof2() {
		String s = "ComS 228";
		assertTrue(s instanceof Object);
	}
	
	@Test
	public void testGetClass1() {
		String s = "Programming rules";
		System.out.println(s.getClass());
	}
	
	@Test
	public void testGetClass2() {
		String s = "Coding is neat.";
		String r = ".taen si gnidoC";
		
		if (s.getClass() != r.getClass()) {
			throw new IllegalStateException();
		}
	}
	
	@Test(expected = IllegalStateException.class)
	public void testGetClass3() {
		String w = "Coding is neat.";
		Object x = (Object) w;
		ArrayList<String> y = new ArrayList();
		Object z = (Object) y;
		
		if (x.getClass() != z.getClass()) {
			throw new IllegalStateException();
		}
	}
}
