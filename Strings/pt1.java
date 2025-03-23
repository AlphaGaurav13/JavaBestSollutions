package Strings;

public class pt1 {
  public static void main(String args[]) {
    StringBuilder sb = new StringBuilder("hello");

    sb.append("Nigga");
    sb.insert(5, "Crazy");
    sb.delete(0,5);
    System.out.println(sb.length());
    sb.deleteCharAt(9);
    sb.replace(0,1, "Hello");
    System.out.println(sb);
    System.out.println(sb.charAt(0));
  }
}
