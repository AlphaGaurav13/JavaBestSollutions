package PracticeQuestion;

public class p15 {
  public static void main(String args[]) {
    String word = "Automation";

    char[] arr = word.toCharArray();
    for(int i = 0; i < arr.length; i=i+2) {
      System.out.print(arr[i] + "");
    }
  }
}
