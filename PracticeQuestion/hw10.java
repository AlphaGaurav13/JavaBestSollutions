package PracticeQuestion;


import java.util.Scanner;
public class hw10 {

  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    int num1 = 0;
    int num2 = 1;


    int num = sc.nextInt();
    System.out.print("0 ");
    for(int i = 1; i <= num; i++) {
      System.out.print(num2 + " ");

      int temp = num1 + num2;
      num1 = num2;
      num2 = temp;
    }
  }
  
}
