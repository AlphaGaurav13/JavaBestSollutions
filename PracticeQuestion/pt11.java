package PracticeQuestion;

public class pt11 {
  public static void main(String args[]) {
    String word = "madam1";

    StringBuilder sb = new StringBuilder(word);

    sb.reverse();

    String ans = sb.toString();

    if(word.equals(ans)) {
      System.out.println("Its palindrome exists : " + ans);
    }else {
      System.out.println("No palindrome exist: " + ans);
    }
  }
}
