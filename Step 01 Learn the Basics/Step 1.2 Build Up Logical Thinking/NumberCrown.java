public class Solution {
    public static void numberCrown(int n) {
        // Write your code here.
        for (int i=n; i>=0; i--) {
            for (int j=1; j<=n-i; j++) {
                System.out.print(j+" ");
            }
            for (int j=0; j<i*2; j++) {
                System.out.print("  ");
            }
            for (int j=n-i; j>=1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

/*

Output for n=5 will be:
1                 1 
1 2             2 1 
1 2 3         3 2 1 
1 2 3 4     4 3 2 1 
1 2 3 4 5 5 4 3 2 1 

*/
