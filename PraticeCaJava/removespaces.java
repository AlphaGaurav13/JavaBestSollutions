public class removespaces {
  public static void main(String args[]) {
    String word = " G  A u r   av ";
    String str1 = word.replaceAll("\\s", "");
    System.out.println(word);
    System.out.print(str1);
  }
}
// trim() : is use to remove the leading and ending space of the string. 
//we can use replaceAll("\\s", "") to remove all the inner and outer space at same time.