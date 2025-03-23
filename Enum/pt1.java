package Enum;

public class pt1 {

  enum day {
    SUNDAY("Today IS HOLDIDAY"),
    MONDAY("TODAY IS MODAY FIRST WORKING DAY"),
    TEUSDAY("TODAY IS TUESDAY"),
    WEDNESDAY("TODAY IS WEDNESDAY"),
    THURSDAY("TODAY IS THURSDAY"),
    FRIDAY("TODAY IS FRIDAY"),
    SATURDAY("TODAY IS ALSO HOLIDAY ENJOY :/");

    private String desc;

    day(String desc) {
      this.desc = desc;
    }

    public String getdesc() {
      return desc;
    }
  }


  public static void main(String args[]) {
    int day = 8;
    day today = day.MONDAY;
    
  }

}
