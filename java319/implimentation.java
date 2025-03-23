package java319;
interface Animal {
  void makesound();
  double PI = 3.147;

  default void run() {

    System.out.println("Animal Running");
  }

  static void stop() {
    System.out.println("Animal Stop");
  }
};

class dog implements Animal {
  public void makevoice() {
    System.out.println("Dog Barks");
  }

  @Override
  public void makesound() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'makesound'");
  }
};

public class implimentation {
  public static void main(String args[]) {
    Animal obj = new dog();
    obj.makesound();
    obj.run();
  }
}

// interface provide 100% abstraction
// loose coupling
// default and static method

