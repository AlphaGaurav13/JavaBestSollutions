package Strings;

import java.util.*;
public class hw3 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    String inputer = sc.next();

    String ans = "";

    for(int i = 0; i < inputer.length(); i++) {
      if(inputer.charAt(i) == '@') {
        break;
      }else {
        ans += inputer.charAt(i);
      }
    }

    System.out.println("User name: " + ans);

  }
}
