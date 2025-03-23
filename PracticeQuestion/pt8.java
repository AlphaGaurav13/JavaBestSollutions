package PracticeQuestion;

import java.util.Arrays;

public class pt8 {
  public static void main(String args[]) {
    String word = "Test Automation Java Automation";
    String[] arr = word.split(" ");
    String ans = "";
    StringBuilder sb = new StringBuilder();

    for(String c : arr) {
      if (sb.indexOf(String.valueOf(c)) == -1) {
        sb.append(c);
        sb.append(" ");
      }
    }
   String ans2 = sb.toString();
   
    // System.out.println(sb);
    String[] arr1 = ans2.split(" ");
    
    // for(int i = 0; i < arr1.length; i++) {
    //   System.out.println(arr[i]);
    // }

    for (int i = 0; i < arr1.length; i++) {
      String temp = arr1[i];
      int count = 0;
      for (int j = 0; j < arr.length; j++) {
        if (temp.equals(arr[j])) {
          count++;
        }
      }

      System.out.print(temp + ": " + count + " ");
    }

  }
}
