package Enum;

enum status {
  running, failed, success, Pending;
}

public class one {
  public static void main(String args[]) {
    // status s = status.success;   //one by one retrival method
    // System.out.println("Status is : " + s);  

    //to take all value at once we use value() it will return array

    // status[] s = status.values();

    // for(status cs : s) {
    //   System.out.println(cs + " : " + cs.ordinal()); //using ordinal function we can print the index of enum constant
    // }


    status s = status.running;

    // if(s == status.running) {
    //   System.out.println("All Good");
    // }else if(s == status.Pending) {
    //   System.out.println("Please Wait");
    // } else if(s == status.failed) {
    //   System.out.println("Please Try Again");
    // }else {
    //   System.out.println("Done");
    // }

    switch(s) {

      case running:
        System.out.println("All Good");
        break;
      case failed:
        System.out.println("Please Try again");
        break;

      case Pending:
        System.out.println("Kindly Wait");
        break;
      
      case success:
        System.out.println("Done");
        break;
    }
  }
}
