package java319;
import java.util.Scanner;
public class three {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    char ch = sc.next().charAt(0);
    if(ch == '+') {
      System.out.println("Sum of two number: " + (a + b));
    } else if(ch == '-') {
      System.out.println("Subtraction of two number: " + (a - b));
    }else if(ch == '*') {
      System.out.println("Multiplication of two number: " + (a * b));
    }else {
      System.out.println("Division of two number: " + (a / b));
    }
  }
}
