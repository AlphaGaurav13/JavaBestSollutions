package PracticeQuestion;

import java.util.Arrays;

public class pt12 {

  public static void main(String args[]) {
    String word1 = "listenr";
    String word2 = "silent";

    char[] arr1 = word1.toCharArray();
    char[] arr2 = word2.toCharArray();

    Arrays.sort(arr1);
    Arrays.sort(arr2);

    String ans1 = String.valueOf(arr1);
    String ans2 = String.valueOf(arr2);

    if (ans1.equals(ans2)) {
      System.out.println("Strings are Anagrams");
    }else {
      System.out.println("String are not Anagrams");
    }
  }

}
