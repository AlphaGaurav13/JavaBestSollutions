package Array;

import java.util.Scanner;

public class hw3 {


  public static boolean checkSorted(int arr[], int n) {
    for(int i = 0; i < n - 1; i++) {
      if(arr[i] > arr[i+1]) {
        return false;
      }
    }

    return true;
  }
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size: ");
    
    int size = sc.nextInt();

    int arr[] = new int[size];

    for(int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    boolean ans = checkSorted(arr, size);

    if(ans) {
      System.out.println("Array is Sorted in Ascending Order");
    }else {
      System.out.println("Array is not sorted in Ascending Order");
    }

  }
}
