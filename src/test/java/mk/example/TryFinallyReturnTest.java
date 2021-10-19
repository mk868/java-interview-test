package mk.example;

import mk.extension.ConsoleToFileExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(ConsoleToFileExtension.class)
class TryFinallyReturnTest {

  @Test
    // tag::main[]
  void main() {
    System.out.println(someMethod(0));
    System.out.println(someMethod(1));
    System.out.println(someMethod(5));
  }

  String someMethod(int i) {
    try {
      if (i == 0) {
        return "try";
      }
    } finally {
      if (i < 5) {
        return "finally";
      }
    }
    return "default";
  }
  // end::main[]

}
