package PracticeQuestion;

import java.util.Scanner;
public class hw1 {

  public static int FindAverage(int num1, int num2, int num3) {
    return (num1 + num2 + num3) / 3;
  }
  
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number1: ");

    int num1 = sc.nextInt();

    System.out.print("Enter the number2: ");

    int num2 = sc.nextInt();

    System.out.print("Enter the number3: ");

    int num3 = sc.nextInt();

    int ans = FindAverage(num1, num2, num3);

    System.out.println(ans);
  }
}
