package java319;
public class six {
  public static void main(String args[]) {
    int[] arr = {5,6, 23,65,1,-3, -7, 9};
    int Max = -999999999;

    for(int i = 0; i < arr.length; i++) {
      if(arr[i] > Max) {
        Max = arr[i];
      }
    }

    System.out.println(Max);
  }
}
