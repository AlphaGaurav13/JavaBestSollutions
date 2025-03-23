package Patterns;

import java.util.Scanner;
public class solidrectangle {
  
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of rows: ");
    int row = sc.nextInt();
    
    System.out.print("Enter number of columns: ");
    int col = sc.nextInt();
    
    //outer loop
    for(int i = 1; i <= row; i++) {
      //inner loop
      for(int j = 1; j <= col; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

  }
}
