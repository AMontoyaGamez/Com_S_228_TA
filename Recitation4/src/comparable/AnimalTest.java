package comparable;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnimalTest {
	private Animal adultZebra = new Animal(500, "adultZebra");
	private Animal youngZebra = new Animal(200, "youngZebra");
	private Animal dog = new Animal(80, "GermanShepherd");
	private Animal elephant = new Animal(12000, "AdultElephant");
			
	@Test
	public void test() {
		
		//CompareTo returns the difference between compared objects
		//Elephant should be heavier than Zebra
		assertTrue(elephant.compareTo(adultZebra)  > 0);
		
		//If the elements are equal, compareTo should return 0
		assertTrue(adultZebra.compareTo(adultZebra) == 0);
		
		//Dog should be lighter than young Zebra
		assertTrue(dog.compareTo(youngZebra) < 0);
	}

}
