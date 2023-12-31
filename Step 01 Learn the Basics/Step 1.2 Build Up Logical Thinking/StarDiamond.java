public class StarDiamond {
    public static void nStarDiamond(int n) {
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
        for (int i=n; i>0; i--) {
            for (int j=n-i; j>0; j--) {
                System.out.print(" ");
            }
            for (int j=i; j>0; j--) {
                System.out.print("*");
            }
            for (int j=i-1; j>0; j--) {
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
*********
 *******
  *****
   ***
    *

*/
