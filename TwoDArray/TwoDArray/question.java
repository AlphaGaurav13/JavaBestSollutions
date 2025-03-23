package TwoDArray;


import java.util.Scanner;
public class question {

  public static void main(String args[]) {


    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the row: ");
    int row = sc.nextInt();
    System.out.print("Enter the columns: ");
    int col = sc.nextInt();


    int[][] arr = new int[row][col];


    for(int i = 0; i < row; i++) {
      for(int j = 0; j < col; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    int ExtraElem = sc.nextInt();

    for(int i = 0; i < row; i++) {
      for(int j = 0; j < col; j++) {
        if(arr[i][j] == ExtraElem) {
          System.out.println("Element found at index: " + i + " " + j);
          break;
        }
      }
    }


  }
  
}
