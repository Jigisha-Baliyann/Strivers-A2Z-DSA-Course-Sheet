public class NForest {
    public static void nForest(int n) {
        // Write your code here
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*

Output for n=5 will be:
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 

*/
