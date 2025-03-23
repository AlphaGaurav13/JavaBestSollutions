package Function;

import java.util.Scanner;
public class addtwonumberusingfunction {

  public static int PrintSum(int num1, int num2) {

    int sum = num1 + num2;

    return sum;
  }
  public static void main(String args[]) {


    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num1 = sc.nextInt();

    System.out.print("Enter a number2: ");

    int num2 = sc.nextInt();

   int ans =  PrintSum(num1, num2);

   System.out.println("Sum of two numbers is: " + ans);
  }
}
