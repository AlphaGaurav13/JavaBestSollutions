package PracticeQuestion;

public class pt2 {
  public static void main(String args[]) {
    int n1 = 0;
    int n2 = 1;
    
    int n = 5; 
    for(int i = 0; i <n; i++) {
      System.out.print(n1 + " ");
      int temp = n1 + n2;
      n1 = n2;
      n2 = temp;
    }
  }
}
