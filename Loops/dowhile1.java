package Loops;


import java.util.Scanner;
public class dowhile1 {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    int i = 0;
    do {
      System.out.print(i + " ");
      i++;
    }while(i <= 10);
  }
}


//  The main difference between while and do-while is that in do-while the body is executed at least once, even if the condition is false.