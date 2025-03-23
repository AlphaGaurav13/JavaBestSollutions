package Enum;

enum Laptop {
  Macbook(2200), XPS(2000), THINKPAD(1800), SURFACE(1500);

  private int price;


  private Laptop(int price) {
    this.price = price;
  }

  public int getprice() {
    return price;
  }

  public void setprice(int price) {
      this.price = price;
  }
}
public class two {
  public static void main(String args[]) {
    Laptop[] laps = Laptop.values();

    for(Laptop x : laps) {
      System.out.println(x + " Price is : " +  x.getprice());
    }
  }
}
