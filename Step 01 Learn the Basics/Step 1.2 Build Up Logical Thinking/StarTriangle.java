public class StarTriangle {
    public static void nStarTriangle(int n) {
        // Write your code here
        for (int i=0; i<n; i++) {
            for (int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++) {
                System.out.print("*");
            }
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*

Output for n=5 will be:
    *
   ***
  *****
 *******
*********

*/
