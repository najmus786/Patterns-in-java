public class Pattern14 {
    /*
         *
        * *
       *   *
      *     *
     *       *
      *     *
       *   *
        * *
         *

     */
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print pattern
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == 1 ) {
                    System.out.print("*");
                } else if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = n-1; i >=1; i--) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print pattern
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == n || i == 1) {
                    System.out.print("*");
                } else if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
