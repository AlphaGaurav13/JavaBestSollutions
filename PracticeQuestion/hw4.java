package PracticeQuestion;

import java.util.Scanner;
public class hw4 {
  public static double radius(int r) {

    double ans = 2 * 3.14 * r;
    return ans;
  } 

  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    double ans = radius(num);


    System.out.println(ans);
  }
}
