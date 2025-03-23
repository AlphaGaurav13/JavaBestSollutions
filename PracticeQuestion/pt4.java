package PracticeQuestion;

public class pt4 {
  public static void main(String args[]) {
    int n = 152;
    int x = n;

    int rev = 0;

    while (n != 0) {
      int temp = n % 10;
      rev += temp * temp * temp;
      n = n / 10;
    }

    if (rev == x) {
      System.out.println("Number is Armstrong Number!");
    } else {
      System.out.println("Number is not a Armstrong number!");
    }
  }
}
