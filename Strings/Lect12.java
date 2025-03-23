package Strings;

import java.util.Scanner;
public class Lect12 {
  public static void main(String args[]) {
    String name = "Gaurav Kumar";

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the name2: ");
    String name2 = sc.nextLine();
    System.out.println("Name2 is : " + name2);
    System.out.println(name);
    //Concatination

    String ans = name + name2;

    System.out.println(name + "$" + name2);

    //length()

    System.out.println(name.length());

    //CharAt()


    // for(int i = 0; i <= name.length(); i++) {
    //   System.out.println(name.charAt(i));
    // }


    //compareTo()


    if(name.compareTo(name2) == 0) {
      System.out.println("Both Strings Are Equal");
    }else {
      System.out.println("Both Strings are not Equal");
    }


    //substring(beg index, end index);


    String subhero = name.substring(2, name.length());
    System.out.println(subhero);



    //Strings are immutable


    //parseInt() , Integer.parseInt(string variable name)



    String num = "123";

    int ans2 = Integer.parseInt(num);
    System.out.println(ans2 * 2);

  //Integer.toString(number)


    String ans3 = Integer.toString(ans2);

    System.out.println(ans3.length());
      
  }
} 