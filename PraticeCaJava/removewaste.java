import java.util.Scanner;

public class removewaste {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();

    String plainstr = word.replaceAll("[^a-zA-Z0-9]", "");
    System.out.print(plainstr);
  }

}
