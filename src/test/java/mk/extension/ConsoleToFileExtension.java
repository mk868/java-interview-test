package mk.extension;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.file.Path;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class ConsoleToFileExtension implements BeforeAllCallback, BeforeEachCallback,
    AfterEachCallback {

  private PrintStream printStream;
  private PrintStream customPrintStream;

  private File getOutLogFile(Class<?> clazz) {
    return Path.of("target", "console", clazz.getSimpleName() + ".out").toFile();
  }

  @Override
  public void beforeAll(ExtensionContext context) throws Exception {
    var outFile = getOutLogFile(context.getRequiredTestClass());
    outFile.delete();
    outFile.getParentFile().mkdirs();
    outFile.createNewFile();
  }

  @Override
  public void beforeEach(ExtensionContext context) throws Exception {
    printStream = System.out;

    var outFile = getOutLogFile(context.getRequiredTestClass());
    customPrintStream = new PrintStream(new FileOutputStream(outFile, true));
    System.setOut(customPrintStream);
  }

  @Override
  public void afterEach(ExtensionContext context) throws Exception {
    System.setOut(printStream);
    printStream = null;
    customPrintStream.close();
    customPrintStream = null;
  }
}
