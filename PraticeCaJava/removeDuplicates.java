import java.util.Scanner;

public class removeDuplicates {
  public static void main(String args[]) {
    Scanner sc =  new Scanner(System.in);
    String word = sc.nextLine();


    // method 1 to remove the duplicates.
    StringBuilder sb = new StringBuilder();
    // word.chars().distinct().forEach(c -> sb.append((char)c)); // using lambda function
    // System.out.print(sb);

    //method 2 using indexof

    for(int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i);
      int idx = word.indexOf(ch, i+1);
      if(idx == -1) {
        sb.append(ch);
      }
    }

    System.out.println(sb);


    //method 3

    char[] arr = word.toCharArray();
    StringBuilder sb1 = new StringBuilder();
    
    for(int i = 0; i < arr.length; i++) {
      boolean repeated = false;
      for(int j = i + 1; j < arr.length; j++) {
        if(arr[i] == arr[j]){
          repeated = true;
          break;
        }
      }
      if(!repeated) {
        sb1.append(arr[i]);
      }
    }

    System.out.print(sb1);

    //method - 4

     


  }
}
