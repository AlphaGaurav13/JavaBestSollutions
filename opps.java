
                             //THIS IS NOT PURE ABSTRACTION BECAUSE HERE WE HAVE EATS METHOD IN ABSTRACT CLASS WHICH IS NOT ABSTRACT SO IT IS NOT A PURE ABSTRACTION

abstract class Animal { //abstract can have abstract and non abstract method.
   //it cannot be instantiated.
  Animal() {
    System.out.println("Successfully! you have created a new Animal");
  }
  abstract void walk();

  public void eats() {
    System.out.println("Animal Eats");
  }
}

//final method is a method that cannot be overriden by any subclasses. when method is declared as final that means its implementation final and it cannot be changed by any class.

class horse extends Animal {
  horse() {
    System.out.println("You have created a horse");
  }
  public void walk() {
    System.out.println("Horse walks on four legs");
  }
}

class chicken extends Animal {

  chicken(){
    System.out.println("You have created chicken");
  }
  public void walk() {
    System.out.println("Chicken walks on two legs");
  }
}

public class opps {
  public static void main(String args[]) {
    horse obj1 = new horse();
    // obj1.walk();

    // chicken obj2 = new chicken();
    // obj2.walk();

    // obj1.eats();
  } 
}
//constructor chaining when u create a object of derived class then first  contructor of base will be called then derived class