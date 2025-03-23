package TwoDArray;

import java.util.Scanner;
public class lect11 {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of rows: ");

    int row = sc.nextInt();

    System.out.print("Enter the number of Columns: ");

    int col = sc.nextInt();

    int arr[][] = new int[row][col];

    for(int i = 0; i < row; i++) {
      for(int j = 0; j < col; j++) {
        arr[i][j] = sc.nextInt();
      }
    }


    //Print 2d Array Elements

    for(int i = 0; i < row; i++) {

      for(int j = 0; j < col; j++) {


        System.out.print(arr[i][j] + " ");
      }

      System.out.println();
    }
  }
}
