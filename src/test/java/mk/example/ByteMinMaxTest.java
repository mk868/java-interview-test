package mk.example;

import mk.extension.ConsoleToFileExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(ConsoleToFileExtension.class)
class ByteMinMaxTest {

  @Test
    // tag::main[]
  void main() {
    System.out.println(Byte.MIN_VALUE);
    System.out.println(Byte.MAX_VALUE);
  }
  // end::main[]

}
