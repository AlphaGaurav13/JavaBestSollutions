interface Animal {
  public void walk();
  // we cannot define the constructor inside the interfaces.
  // we can just declare the method but we cannot define it there.

  //All the fields inside the interfaces are public, static and final  by default.

}

interface Herbivore {

}


class horse implements Animal, Herbivore {
    public void walk() {
      System.out.println("Horse walk on four legs");
    }
}

class chicken implements Animal {
  public void walk() {
    System.out.println("Chicken walks on two legs");
  }
}

public class interface1 {
  public static void main(String args[]) {
    horse obj1 = new horse();
    obj1.walk();

    chicken obj2 = new chicken();
    obj2.walk();
  }
}
