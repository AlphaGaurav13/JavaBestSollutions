package PracticeQuestion;

public class pt3 {
  public static void main(String args[]) {
    int n = 120;
    int x = n;
    int rev = 0;
    while(n != 0) {
      int temp = n % 10;
      rev = rev * 10 + temp;
      n = n / 10;
    }

    System.out.println("Reversed number is : " + rev);
  }
}
