public class SymmetricVoid {
    public static void symmetry(int n) {
        // Write your code here
        for (int i=0; i<n; i++) {
            for (int j=n-i; j>0; j--) {
                System.out.print("* ");
            }
            for (int j=0; j<i*2; j++) {
                System.out.print("  ");
            }
            for (int j=n-i; j>0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=n; i>=0; i--) {
            for (int j=0; j<n-i; j++) {
                System.out.print("* ");
            }
            for (int j=0; j<i*2; j++) {
                System.out.print("  ");
            }
            for (int j=0; j<n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*

Output for n=5 will be:
* * * * * * * * * * 
* * * *     * * * * 
* * *         * * * 
* *             * * 
*                 * 
*                 * 
* *             * * 
* * *         * * * 
* * * *     * * * * 
* * * * * * * * * * 

*/
