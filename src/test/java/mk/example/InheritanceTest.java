package mk.example;

import mk.extension.ConsoleToFileExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(ConsoleToFileExtension.class)
class InheritanceTest {

  @Test
    // tag::main[]
  void main() {
    Cat cat = new Cat();
    Animal animal = (Animal) cat;

    System.out.println(cat.getType());
    System.out.println(animal.getType());
  }

  abstract class Animal {

    public String getType() {
      return "animal";
    }
  }

  class Cat extends Animal {

    public String getType() {
      return "cat";
    }
  }
  // end::main[]

}
