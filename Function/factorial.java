package Function;

import java.util.Scanner;
public class factorial {

  public static int Fact(int num1) {

    int fact = 1;
    for(int i = 1; i <= num1; i++) {
      fact = fact * i;
    }

    return fact;
  }

  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num1 = sc.nextInt();

    int ans = Fact(num1);

    System.out.println("Factorial of " + num1 + " is: " + ans);
  }
  
}
