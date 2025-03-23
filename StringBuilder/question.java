package StringBuilder;

public class question {
  public static void main(String args[]) {
    StringBuilder word = new StringBuilder("Hello");

    
    for(int i = 0; i < word.length()/2; i++) {
      
      int front = i;
      int back = word.length() - 1 - i;


      char frontChar = word.charAt(front);
      char backChar = word.charAt(back);

      word.setCharAt(front, backChar);
      word.setCharAt(back, frontChar);
    }


    System.out.println(word);
  }
}
