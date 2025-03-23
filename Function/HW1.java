package Function;


public class HW1 {

  public static boolean IsPrime(int num) {

    boolean ans = true;
    for(int i = 2; i < num; i++) {
      if(num % i == 0) {
        ans =  false;
      }
    }
    return ans;
  }
  public static void main(String args[]) {

    int num = 8;

    boolean ans = IsPrime(num);

    if(ans) {
      System.out.println("Prime Number");
    }else {
      System.out.println("Not Prime Number");
    }
  }
}
