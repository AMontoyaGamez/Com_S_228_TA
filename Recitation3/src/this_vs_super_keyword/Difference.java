package this_vs_super_keyword;
class Animal {
  void eat() {
    System.out.println("animal : eat");
  }
}

class Dog extends Animal {
  void eat() {
    System.out.println("dog : eat");
  }
  void anotherEat() {
    super.eat();
  }
}

public class Difference {
  public static void main(String[] args) {
    Animal a = new Animal();
    a.eat();
    Dog d = new Dog();
    d.eat();
    d.anotherEat();
  }
}