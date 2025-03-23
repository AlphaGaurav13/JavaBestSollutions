package PracticeQuestion;

public class pt10 {
  public static void main(String args[]) {
    String str = "abcd";

    permute(str, 0, str.length() - 1);
  }


  public static void permute(String str, int l, int r) {
    if(l == r) {
      System.out.println(str);
    }else {
      for(int i = l; i <= r; i++) {
        String swapped = swap(str, l, i);
        permute(swapped, l + 1, r);
      }
    }
  }

  public static String swap(String str, int pos1, int pos2) {
    char[] arr = str.toCharArray();
    char temp = arr[pos1];
    arr[pos1] = arr[pos2];
    arr[pos2] = temp;
    return String.valueOf(arr);
  }
}
