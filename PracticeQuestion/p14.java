package PracticeQuestion;

public class p14 {
  public static void main(String args[]) {
    String word = "Java Automation";

    char[] arr = word.toCharArray();

    StringBuilder sb = new StringBuilder();

    String ans = " ";
    for(char c :  arr) {
      if(sb.indexOf(String.valueOf(c)) == -1) {
        sb.append(c);
        sb.append(" ");
      } 
    }

    ans = sb.toString();

    char[] mainans = ans.toCharArray();
    for(int i = 0; i < mainans.length; i++) {
      System.out.print(mainans[i] + "");
    }
  }
}
