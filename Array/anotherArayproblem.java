package Array;


import java.util.Scanner;
public class anotherArayproblem {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of Array: ");
    int size = sc.nextInt();

    int arr[] = new int[size];

    for(int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    int ExtraElement  = sc.nextInt();

    boolean ans = false;
    for(int i = 0; i < size; i++) {
      if(arr[i] == ExtraElement) {
        // System.out.println("Element found at index " + i);
        ans = true;
        break;
      }
    }

    if(ans) {
      System.out.println("Element found in Array.");
    }else {
      System.out.println("Element not found in Array.");
    }

  }
}
