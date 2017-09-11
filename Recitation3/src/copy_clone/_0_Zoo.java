package copy_clone;

import java.util.ArrayList;

/**
 * Class that emulates a Zoo
 * 
 * @author Arnoldo Montoya-Gamez
 *
 */
public class _0_Zoo implements Cloneable{
	private int currentAnimalCount;
	private int animalLimit;
	private boolean full;
	private ArrayList<String> animals;

	/**
	 * Constructor for a Zoo
	 * 
	 * @param givenLimit
	 *            limit of animals one can have at the zoo at a time
	 */
	public _0_Zoo(int givenLimit) {
		this.animalLimit = givenLimit;
		currentAnimalCount = 0;
		full = false;
		animals = new ArrayList<String>();
	}

	/**
	 * Method that adds a new animal to Zoo, as long as there is stills space
	 * for another animal
	 * 
	 * @param newAnimal
	 *            animal wanting to be added to Zoo
	 * 
	 * @return Whether Zoo took the newAnimal or not
	 */
	public boolean addAnimal(String newAnimal) {
		if (!full) {
			animals.add(newAnimal);
		} else
			return false;

		currentAnimalCount = animals.size();
		if (currentAnimalCount == animalLimit)
			full = true;

		return true;
	}

	@Override
	protected _0_Zoo clone(){
		//1- make class implement cloneable
		//2- create this clone() method
		
		//Variable being used later
		_0_Zoo retZoo;
		//3- run super.clone() in a try-catch block
			//In case the superclass does not support clone
		try{
			retZoo = (_0_Zoo)super.clone();
		}
		catch(CloneNotSupportedException c){
			return null;
		}
		
		//4- copy all things inside object if you're targeting a deep copy.
		retZoo.animalLimit = this.animalLimit;
		retZoo.currentAnimalCount = this.currentAnimalCount;
		retZoo.full = this.full;
		ArrayList<String> arrListClone = (ArrayList<String>) this.animals.clone();
		retZoo.animals = arrListClone;
		
		return retZoo;
	}

	/**
	 * Copy constructor for a Zoo
	 * 
	 * @param copy
	 *            Object of this type, that will be used to copy.
	 */
	public _0_Zoo(_0_Zoo copy) {
		if(copy != null){
			this.animalLimit = copy.animalLimit;
			this.currentAnimalCount = copy.currentAnimalCount;
			this.full = copy.full;
			this.animals = (ArrayList<String>) copy.animals.clone();
		}
		else{
			throw new IllegalArgumentException("null Object Given");
		}
	}

}
