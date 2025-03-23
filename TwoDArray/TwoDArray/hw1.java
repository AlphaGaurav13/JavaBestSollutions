package TwoDArray;

import java.util.Scanner;
public class hw1 {

  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the row: ");
    int row = sc.nextInt();
    System.out.print("Enter the columns: ");
    int col = sc.nextInt();

    int arr[][] = new arr[row][col];

    for(int i = 0; i < row; i++) {
      for(int j = 0; i < col; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    
  }
  
}
