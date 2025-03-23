package PracticeQuestion;

public class pt13 {
  public static void main(String args[]) {
    String word = "Hello World";

    char[] vow = { 'a', 'e', 'i', 'o', 'u' };

    char[] mainstr = word.toCharArray();

    int count1 = 0;
    int count2 = 0;

    for (int i = 0; i < mainstr.length; i++) {
      char c = mainstr[i];

      for (int j = i+1; j < vow.length; j++) {
        if (c == vow[i]) {
          count1++;
        } else {
          count2++;
        }
      }

    }

    System.out.println("Vowels: " + count1);
    System.out.println("Consonants: "+ count2);
  }
}
