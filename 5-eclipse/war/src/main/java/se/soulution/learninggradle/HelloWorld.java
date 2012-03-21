package se.soulution.learninggradle;

import se.soulution.learninggradle.jar.Greeter;

public class HelloWorld {

  public static void main(String... args) {
    Greeter greeter = new Greeter();
    System.out.println(greeter.greet());
  }
}
