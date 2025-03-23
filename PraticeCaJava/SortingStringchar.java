import java.util.Arrays;

public class SortingStringchar {
  public static void main(String args[]) {
    String input = "gaurav";

    char[] arr = input.toCharArray();
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          char temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }

    System.out.println(new String(arr));


    //method 2

    char[] arr1 = input.toCharArray();
    Arrays.sort(arr1);
    System.out.println(new String(arr1));
    System.out.print(arr1[0]);
  }
}
