package Function;

public class hw3 {
  public static void Table(int num) {

    for(int i = 1; i <= 10; i++) {
      System.out.println( num + " * " + i + " = " + (num * i));
    }

    return;
  }

  public static void main(String args[]) {

    int n = 5;

    Table(n);
  }
}
