package OOPS;
import bank.Bank;

class Shape {
  String color;
}


class Circle extends Shape {
  public void area(int r) {
    System.out.println(2 * 3.14 * r * r);
  }
}
public class inherit {
  public static void main(String args[]) {
    Circle c1 = new Circle();
    c1.color = "red";

   Bank bank = new Bank();
    bank.name = "Gaurav";
  }
}

//in c++ we have 5 type of inheritance but in java we have 4 type of inheritance
//1 )  single level inheritance -- > basic inheritance in which only one child and one parent is there and child is simply inheriting the properties of parent


//2 ) hierarchical inheritance --- > basic inheritance in which multiple child and one parent is there.

//3 ) multilevel inheritance ---> like there is your grandfather  , fATHER,  and the inheritance is in the form of father inherting the properties of grandfather and your are inheriting the property of your father.


//4 ) hybrid inheritance --> different type of inheritance is being implementing in a code  like combination of single and mutli level iunheritance



