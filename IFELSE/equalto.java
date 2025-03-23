package IFELSE;

import java.util.Scanner;
public class equalto {
  public static void main(String args[]) {


    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a num1: ");
    int num1 = sc.nextInt();
    System.out.print("Enter a num2: ");
    int num2 = sc.nextInt();

    if(num1 == num2) {
      System.out.println("Num1 and Num2 are equal");
    }else if(num1 > num2) {
      System.out.println("Num1 is greater than Num2");
    }else {
      System.out.println("Num2 is greater than Num1");
    }
  }
}
