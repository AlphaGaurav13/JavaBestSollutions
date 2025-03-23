package PracticeQuestion;

import java.util.Arrays;

public class pt7 {

  public static void main(String args[]) {
    String word = "Learn Java Programming".toLowerCase();
    StringBuilder sb = new StringBuilder();
    // String temp = sb.unique().toString();

    for (char c : word.toCharArray()) {
      if (sb.indexOf(String.valueOf(c)) == -1) {
        sb.append(c);
      }
    }

    String temp1 = sb.toString();
    char[] chars = temp1.toCharArray();
    Arrays.sort(chars);
    String temp = new String(chars);
    // String temp = sb.toString();

    // System.out.println(temp);

    for (int i = 0; i < temp.length(); i++) {
      char c = temp.charAt(i);
      if(c != ' ') {
        int count = 0;
      for (int j = 0; j < word.length(); j++) {
        if (c == word.charAt(j)) {
          count++;
        }

      }
      if (count > 1) {
        System.out.print(c + ": " + count + " ");
      }
      }
    }
  }
}