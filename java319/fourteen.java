package java319;

class BankAccount {

  protected double accountBalance;


  BankAccount(double balance) {
    this.accountBalance = balance;
  }
  protected void displayBalance() {
    System.out.println("Your current balance is : " + accountBalance);
  }

};


class SavingsAccount extends BankAccount {

  
    protected double interestRate;

    SavingsAccount(double balance,double interest){
      super(balance);
      this.interestRate=interest;
      }
  @Override
  protected void displayBalance() {
    super.displayBalance();
    System.out.println("Your current interest is: " + interestRate);
  }
};

class CheckingAccount extends BankAccount {

  
    protected double overdraftLimit;
    CheckingAccount(double x, double y)
{
super(x);
this.overdraftLimit = y;
}

  @Override
  protected void displayBalance() {
   super.displayBalance();
    System.out.println("Your current draftlimit is: " + overdraftLimit);
  }

};
public class fourteen {
  public static void main(String args[]) {
    SavingsAccount obj1 = new SavingsAccount(10000, 30);
    CheckingAccount obj2 = new CheckingAccount(100000, 25000);
obj1.displayBalance();
obj2.displayBalance();
  }
}
