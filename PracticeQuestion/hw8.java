package PracticeQuestion;


import java.util.Scanner;
public class hw8 {

  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();


    int num2 = sc.nextInt();

    int sum = 1;
    for(int i = 1; i <= num2; i++) {
      sum = sum * num;
    }

    System.out.println(sum);
  }
  
}
