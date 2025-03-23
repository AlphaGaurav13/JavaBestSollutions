package OOPS;

class addition {
  int a;
  String name;
  int age;

  addition() {
    System.out.println("This is defualt Constructor!");
  }

  addition(String a, int b) {
    this.name =  a;
    this.age = b;
  }

  addition(addition otherobj) {
    this.name = otherobj.name;
    this.age = otherobj.age;
  }





}

public class pt1 {
  public static void main(String args[]) {
    addition obj = new addition();
    addition obj2 = new addition("Gaurav",3);
    addition obj3 = new addition(obj2);

    System.out.println(obj3);
  }
}
