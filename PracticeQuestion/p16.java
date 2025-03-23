package PracticeQuestion;

public class p16 {
  public static void main(String args[]) {
    String word = "Welcome to Java World";

    String ans = "";
    String[] arr = word.split(" ");

    for(int i = 0; i < arr.length; i++) {
      ans += arr[i];
    }

    System.out.println(ans);
  }
}
