package BitManupulation;


import java.util.Scanner;
public class clearbit {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = sc.nextInt();

    int pos = sc.nextInt();
    int bm = 1 << pos;

    int res = (n) & (~bm);

    System.out.println(res);
  }
}
