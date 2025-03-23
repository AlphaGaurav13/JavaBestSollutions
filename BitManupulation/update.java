package BitManupulation;

import java.util.*;
@SuppressWarnings("unused")
public class update {
  public static void  main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number: ");

    int n = sc.nextInt();

    int pos = 1;
    System.out.print("Enter the operation you want to perform: ");

    int opr = sc.nextInt();
    int bm = 1 << pos;


    if(opr == 1) {
      int res = bm | n;
      System.out.println(res);
    }else {
      int res = (~bm) & n;
      System.out.println(res);
    }
  }
}
