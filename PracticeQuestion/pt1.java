package PracticeQuestion;

public class pt1 {

  @SuppressWarnings("unused")
  public static boolean isPrime(int n ) {
    for(int i = 2; i < n; i++) {
      if(n % i == 0) {
        return false;
      }
      break;
    }
    return true;
  }
  public static void main(String args[]) {
    int n = 5;

    if(isPrime(5)) {
      System.out.println("The number is prime number!");
    }else {
      System.out.println("The number is composite number!");
    }
  }
}
