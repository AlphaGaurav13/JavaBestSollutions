package java319;
import java.util.*;

//   Problem Statement:

// Write a Java program to implement a Counter that increments a number every time a function is called.

// Your task is to:

// Create a class called Counter with a static integer variable called count to keep track of the count.
// Create a public method called increment() that increases the value of count by 1 each time it's called.
// Create a public method called showCount() that prints the current value of count.
// In the main method:
// Create an object of the Counter class.
// Call the increment() method three times using the object.
// Call the showCount() method to display the current count.

// sa
// Sahil
// 8:50 PM
// Instructions:
// The class should have only the necessary fields and methods.
// The count variable should be static because it should be shared across all instances of the Counter class.
// Use the increment and showCount methods appropriately in the main method.

class Counter {
  int counter = 0;

  int increment() {
    counter++;
    return counter;
  }

  public int showcount() {
    return counter;
  }
}

public class four {
  public static void main(String[] args) {
    Counter c = new Counter();
    System.out.println(c.increment());
    System.out.println(c.increment());
    System.out.println(c.increment());
    System.out.println(c.showcount());
  }
}