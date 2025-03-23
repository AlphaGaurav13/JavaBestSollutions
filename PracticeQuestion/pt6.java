package PracticeQuestion;

public class pt6 {
  public static void main(String args[]) {
    String word = "Java is good programming langauges";

    String[] arr = word.split(" ");

    String ans = "";
    for(int i = 0; i < arr.length; i++) {
      StringBuilder sb = new StringBuilder(arr[i]);
      ans += sb.reverse().toString();
      ans += " ";
    }

    System.out.println(ans);
  }
}
