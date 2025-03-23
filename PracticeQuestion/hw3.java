package PracticeQuestion;

import java.util.Scanner;
public class hw3 {

  public static int GreaterOrNot(int num1, int num2) {
    if(num1 > num2) {
      return num1;
    }else {
      return num2;
    }
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    int ans = GreaterOrNot(num1, num2);
    System.out.println(ans);
  }
}
