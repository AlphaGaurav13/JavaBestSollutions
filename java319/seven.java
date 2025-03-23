package java319;

public class seven {
  public static void main(String args[]) {
    int[] arr = {1, 3, 4, 1,6,4,2,1,5,7,8,3,1,3,4,6};
    int elem = 3;
    int count = 0;
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] == elem) {
        count++;
    }
  }

  System.out.println("Frequency of " + elem + " is " + count);
}
}
