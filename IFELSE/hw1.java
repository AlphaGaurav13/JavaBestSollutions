package IFELSE;

import java.util.Scanner;

public class hw1 {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter num1: ");
    int num1 = sc.nextInt();
    System.out.print("Enter num2: ");
    int num2 = sc.nextInt();

    char operation = sc.next().charAt(0); // charAt(0) returns the first character in the string

    switch(operation) {
      case '+': 
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + num1 + num2);
        break;
      case '-':
        System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + (num1 - num2));
        break;
      case '*':
      System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + (num1 * num2));
      break;

      case '/':
       System.out.println("Division of " + num1 + " and " + num2 + " is " + (num1 / num2 ));
       break;

      case '%':
       System.out.println("Modulus of " + num1 + " and " + num2 + " is " + (num1 % num2 ));
       break;

      default:
        System.out.println("Invalid operation");
    }
  }
}
