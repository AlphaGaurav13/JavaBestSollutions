package PracticeQuestion;

import java.util.Scanner;
public class hw7 {


  public static void main(String  args[]) {

    Scanner sc = new Scanner(System.in);

    int CountPositive = 0;
    int CountNegative = 0;
    int CountZero = 0;
    while(true) {
      int elem = sc.nextInt();
      if(elem == 0 ){
        CountZero++;
        break;
      }else if(elem > 0) {
        CountPositive++;
      }else{
        CountNegative++;
      }
    }

    System.out.println("Positive: " + CountPositive);
    System.out.println("Negative: " + CountNegative); 
    System.out.println("Zero: " + CountZero);
  }
  
}
