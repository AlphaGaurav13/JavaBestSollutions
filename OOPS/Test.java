package OOPS;

//function overloading - same of of functions but with different parameters or these function perfoming differnet task is kown as function overloading.

class Student {
  String name;
  int age;

  // Student(String name, int age) {
  //   this.name = name;
  //   this.age = age;
  // }

  public void printinfo(String name) {
    System.out.println(this.name);
  }

  public void printinfo(int age) {
    System.out.println(this.age);

  }

  public void printinfo(String name, int age) {
    System.out.println("Name: " + this.name + " Age: " + this.age);
  }
}


public class Test {
  public static void main(String args[]) {
    Student s1 = new Student();
    s1.name = "Gaurav";
    s1.age = 19;
    
    s1.printinfo(s1.name);
    s1.printinfo(s1.age);

    s1.printinfo(s1.name, s1.age);
  }
}