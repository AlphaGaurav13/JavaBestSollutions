package Array;

import java.util.Scanner;

public class hw2 {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size: ");

    int size = sc.nextInt();

    int arr[] = new int[size];
    for(int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    int Min = Integer.MAX_VALUE;
    int Max = Integer.MIN_VALUE;

    for(int i = 0; i < arr.length; i++) {
      if(arr[i] < Min) {
        Min = arr[i];
      }

      if(arr[i] > Max) {
        Max = arr[i];
      }
    }

    System.out.println("Minimum value = " + Min);
    System.out.println("Maximum value = " + Max);

  }
  
}
