package Loops;

import java.util.Scanner;
public class hw3 {
  
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    

    do{
      System.out.print("Enter the choice: ");
      int num = sc.nextInt();
      if(num == 0) {
        break;
      }else {
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        if(marks >= 90) {
          System.out.println("This is good");
        }else if(marks <= 89 && marks >= 60) {
          System.out.println("This is also good");
        }else {
          System.out.println("this is Good As Well");
        }
      }
    }while(true);
  }
}
