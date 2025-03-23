package IFELSE;

import java.util.Scanner;

public class lect1 {

  //basic if else code 
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    if(a >= 18) {
      System.out.println("Adult");
    }else {
      System.out.println("Minor :>");
    }
  }
}
