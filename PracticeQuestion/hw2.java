package PracticeQuestion;
import java.util.Scanner;


public class hw2 {

  public static int FindSumOfOdd(int num) {

    int sum = 0;
    for(int i = 1; i <= num; i++) {
      if(i % 2 != 0) {
        sum = sum  + i;
      }
    }
    return sum;
  }
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    int ans = FindSumOfOdd(num);

    System.out.print(ans);
  }
}
