package se.soulution.learninggradle.jar;

import static org.junit.Assert.*;
import org.junit.Test;

public class GreeterTest {

  @Test
  public void testGreet() {
    Greeter greeter = new Greeter();
    assertNotNull(greeter.greet());
  }
}