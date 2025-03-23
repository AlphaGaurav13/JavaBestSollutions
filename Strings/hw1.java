package Strings;

import java.util.*;
import java.util.Scanner;
public class hw1 {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);


    System.out.print("Enter the Size of Array: ");
    int size = sc.nextInt();
    String[] arr = new String[size];

    int sumlength = 0;
    for(int i = 0; i < size; i++) {
      arr[i] = sc.next();
      sumlength += arr[i].length(); 
    }



    System.out.println("Combined Length of Array Strings is: " + sumlength);



  }
}
