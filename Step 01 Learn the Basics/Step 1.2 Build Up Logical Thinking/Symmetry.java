public class Symmetry {
    public static void symmetry(int n) {
        // Write your code here
        for (int i=0; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            for (int j=0; j<=2*(n-i); j++) {
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=n; i>0; i--) {
            for (int j=1; j<i; j++) {
                System.out.print("* ");
            }
            for (int j=0; j<2*(n-i); j++) {
                System.out.print("  ");
            }
            for (int j=1; j<i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*

Output for n=5 will be:
*                 *
* *             * * 
* * *         * * * 
* * * *     * * * *
* * * * * * * * * *
* * * *     * * * * 
* * *         * * * 
* *             * * 
*                 * 

*/
