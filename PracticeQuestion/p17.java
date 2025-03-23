package PracticeQuestion;

public class p17 {
  public static void main(String args[]) {
    String word = "hello";

    char[] arr = word.toCharArray();
    String ans = "";

    for(int i = 0; i < arr.length; i++) {
      char temp = arr[i];

      for(int j = 0; j < 2; j++) {
        ans += temp;
      }
    }

    System.out.println(ans);
  }
}
