package mk.example;

import mk.extension.ConsoleToFileExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(ConsoleToFileExtension.class)
class IntegerCacheTest {

  @Test
    // tag::main[]
  void main() {
    Integer i1 = 20;
    Integer i2 = 20;
    System.out.println(i1 == i2);
    System.out.println(i1.equals(i2));

    Integer i3 = 200;
    Integer i4 = 200;
    System.out.println(i3 == i4);
    System.out.println(i3.equals(i4));
  }
  // end::main[]

}
