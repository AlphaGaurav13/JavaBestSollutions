package StringBuilder;


import java.util.*;

//We know that Strings in java is immutable but it take's so much time to make changes for that we use stringbuilder which allow us to make changes at same place in heap without making changing its place.
public class lecture13 {
  public static void main(String args[]) {
    StringBuilder sb = new StringBuilder("Tony");

    System.out.println(sb);
    System.out.println(sb.charAt(0));
    //set char at index zer
    sb.setCharAt(0, 'P');
    System.out.println(sb);


    //insert(0, 'S')
    sb.insert(0, 'S');
    System.out.println(sb);

    //delete(start, end)

    sb.delete(1, 3);
    System.out.println(sb);

    //append()

    sb.append("hero");
    System.out.println(sb);


    //str.length()
  }
}