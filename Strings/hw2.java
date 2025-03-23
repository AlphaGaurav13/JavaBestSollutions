package Strings;


import java.util.*;
public class hw2 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    String userinput = sc.next();

    userinput = userinput.replace('e', 'i');

    System.out.println(userinput);
  }
}
