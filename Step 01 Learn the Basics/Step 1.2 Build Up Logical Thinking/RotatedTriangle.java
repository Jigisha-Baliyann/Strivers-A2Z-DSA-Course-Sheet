public class RotatedTriangle {
    public static void nStarTriangle(int n) {
        // Write your code here
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n-1; i>0; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*

 Output for n=5 will be:
*
**
***
****
*****
****
***
**
*

*/
