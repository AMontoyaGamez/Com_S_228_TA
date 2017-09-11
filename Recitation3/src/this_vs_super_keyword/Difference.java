/**
 * @author jason
 */

package this_vs_super_keyword;

class Animal {
	private String name;
	public Animal(String name) {
		this.name = name;
	}
	
	void eat() {
		System.out.println("Animal : eat");
	}
	
	void sayName() {
		System.out.println("My name: " + name);
	}
}

class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}

	void eat() {
		System.out.println("Dog : eat");
	}

	void anotherEat() {
		super.eat();
	}
}

public class Difference {
	public static void main(String[] args) {
		Animal a = new Animal("Arnoldo");
		a.sayName();
		a.eat();
		Dog d = new Dog("Jason");
		d.sayName();
		d.eat();
		d.anotherEat();
	}
}