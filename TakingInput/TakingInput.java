package TakingInput;

import java.util.Scanner;

class TakingInput {
  public static void main(String args[]) {

    //In this code I am taking input from the user
    System.out.println("Enter your name: ");
    Scanner sc = new Scanner(System.in);
    
    String name = sc.nextLine();
    System.out.println(name);

    System.out.println("Enter your age:");
    int age = sc.nextInt();
    System.out.println(age);


    System.out.println("Enter your height:");
    float height = sc.nextFloat();
    System.out.println(height);
  }  
}
