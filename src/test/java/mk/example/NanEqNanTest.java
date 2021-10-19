package mk.example;

import java.util.Objects;
import mk.extension.ConsoleToFileExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(ConsoleToFileExtension.class)
class NanEqNanTest {

  @Test
    // tag::main[]
  void main() {
    System.out.println(Double.NaN == Double.NaN);
    System.out.println(Objects.equals(Double.NaN, Double.NaN));
    double x = Double.NaN;
    System.out.println(x == x);
  }
  // end::main[]

}
