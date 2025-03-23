package Patterns;

public class hw2 {
  public static void main(String[] args) {
        // Outer loop for rows
        for (int i = 1; i <= 5; i++) {
            // Inner loop for printing numbers
            for (int j = 1; j <= 5; j++) {
                // Print spaces before the number
                if(j > i ) {
                    System.out.print(" ");
                }else {
                  System.out.print(i);
                }
                // Print the number
                
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
