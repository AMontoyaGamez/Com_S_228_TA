package comparable;

public class Animal implements Comparable<Animal> {
	private int weight;
	private String type;

	public Animal(int givenWeight, String givenType) {
		weight = givenWeight;
		type = givenType;
	}

	@Override
	public String toString() {
		return "Animal: " + type + ", weight: " + weight;
	}

	/*
	 * This compareTo is using the weight to order them.
	 */
	@Override
	public int compareTo(Animal arg0) {
		// Is this the right way to write compareTo 
		//method.
		int difference = this.type.compareTo(arg0.type);
		
		if (difference == 0) {
			return this.weight - arg0.weight;
		}
		
		return difference;
	}

	/*
	 * You could also use the names to sort by, 
	 * but compare to must be
	 * implemented that way.
	 */
//	@Override
//	public int compareTo(Animal arg0) {
//		// Is this the right way to write 
	    // compareTo method.
//		return this.type.compareTo(arg0.type);
//	}
}
