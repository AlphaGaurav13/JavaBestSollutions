package java319;
import java.util.Scanner;
public class two {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int row = 5;
    int col = 5;

    for(int i = 1; i <= row; i++) {
      for(int j = 1; j <= col; j++) {
        if(i >= j) {
          System.out.print("* ");
        }else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
