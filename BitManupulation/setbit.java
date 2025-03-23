package BitManupulation;

import java.util.Scanner;

public class setbit {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int x = n;
    int arr[] = new int[5];

    for(int i = 0; i < 5; i++) {
      int temp = n % 2;
      arr[i] = temp;
      n = n / 2;
    }

    System.out.println("Binary of " + x + " is: ");

    for(int i = arr.length - 1; i >= 0 ; i--) {
      System.out.print(arr[i] + " ");
    }

    System.out.println();


    System.out.print("Enter the position for bit to be set: ");
    int position = sc.nextInt();

    int bm = 1 << position;
    System.out.println("bm = " + bm);

    int res = bm | x;
    int arr1[] = new int[5];

    System.out.println("bm = " + bm + " res = " + res);
    for(int i = 0; i < 5;i++) {
      int temp = res % 2;
      arr1[i] = temp;

      res /= 2; 
    }


    for(int i = arr1.length - 1; i >= 0; i--) {
      System.out.print(arr1[i] +  " ");
    }


  }
}
