package bank;

class Account {
  public String name;
  protected String email;
  private String password;

  //for using the private things of class in main class we use the concept of getter and setters;

  public String getpassword() {
    return password;
  }

  public void  setpassword(String pass) {
    this.password = pass;
  }
}
public class Bank {

  public static void main(String args[]) {
    Account account1 = new Account();
    account1.name = "Apna collage";
    account1.email = "gauravkk345@gmail.com";
    account1.setpassword("nigga123");

    System.out.println(account1.getpassword());
  }
}


// default access modifier: we can access the method with in same package but not outside the package.
//Protected access modifier: can be accessible from subclasses of other package and can be accessible anywhere with in own  file.


//data hiding : is the process of protecting members of the class from unintended changes.
//Abstraction : hiding the implemenation details and showing only important/usefull part to the user.