package IFELSE;


import java.util.Scanner;
public class switch1 {

  //Performing Condition using switches
  public static void main(String args[]) {


    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = sc.nextInt();


    switch(num) {

      case 1:
        System.out.println("Hello");
        break;
      case 2:
        System.out.println("Namste");
        break;
      case 3:
      System.out.println("Bonjour");
      break;
      default:
        System.out.println("Invalid Number");
    }
  }
}
