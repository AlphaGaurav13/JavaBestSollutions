package BitManupulation;
public class question1 {
  public static void main(String args[]) {
    int n = 5;
    int position = 0;

    int  bm = 1 << position;


    if((bm & n) == 0) {
      System.out.println("Bit was Zero");
    }else {
      System.out.println("Bit Was One");
    }
  }
}
