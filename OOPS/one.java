package OOPS;
class Pen {
  String color;
  String type;


  public void write() {
    System.out.println("Something Writing!");
  }

  public void printcolor() {
    System.out.println(this.color);
  }
}

class Student {
  String name;
  int age;

  public void printinfo() {
    System.out.println("Student Name: " + this.name);
    System.out.println("Student Age: " + this.age);
  }

  Student() {
    System.out.println("Constructor is called");
  }

  Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  Student(Student s2) {
    this.name = s2.name;
    this.age = s2.age;
  }


}

public class one {
  public static void main(String args[]) {
    Pen p1 = new Pen();
    p1.color = "blue";
    p1.type = "gel";

    Pen p2 = new Pen();
    p2.color = "red";
    p2.type = "BallPoint";

    // p1.printcolor();
    // p2.printcolor();
    Student s1 = new  Student("Gaurav", 19);
    // s1.name = "Gaurav";
    // s1.age = 19;
    // s1.printinfo();
    //copy contructor : it is use to copy the value of one object to another
    Student s2 = new Student(s1);

    s2.printinfo();

  }
}

