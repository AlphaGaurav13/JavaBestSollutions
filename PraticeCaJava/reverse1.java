import java.util.Scanner;

public class reverse1 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the String: ");
    String word = sc.nextLine();
    char[] array = word.toCharArray();
    // for(int i = array.length - 1;  i >= 0; --i) {
    //   System.out.print(array[i]);
    // }

    //2nd method

    // for(int i = word.length() - 1; i >= 0; --i) {
    //   System.out.print(word.charAt(i));
    // }

    //3rd method


    // StringBuilder sb =  new StringBuilder(word);
    // System.out.print(sb.reverse());

    //method 4

    StringBuilder sb = new StringBuilder(word);
    System.out.print(sb.reverse());
  }
}