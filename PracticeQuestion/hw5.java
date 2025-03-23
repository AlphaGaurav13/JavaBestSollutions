package PracticeQuestion;

import java.util.Scanner;

public class hw5 {
  public static boolean eligible(int age) {
    if(age >= 18) {
      return true;
    }else {
      return false;
    }
  }

  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    if(eligible(num)) {
      System.out.println("Eligible");
    }else {
      System.out.println("Not Eligible");
    }
  }
}
