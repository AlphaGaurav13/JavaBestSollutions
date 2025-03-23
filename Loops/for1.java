package Loops;

import java.util.Scanner;
public class for1 {
   // Using for loop for printing 0 to n nubers using for loop.
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    for(int i = 0; i <= a; i++) {
      System.out.print(i + " ");
    }
  }
}
