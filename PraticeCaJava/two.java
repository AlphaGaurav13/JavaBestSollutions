import java.util.Scanner;


public class two {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();

    String plaintext = word.replaceAll("[^a-zA-Z0-9]", "");

    System.out.println(plaintext);
  }   
}
