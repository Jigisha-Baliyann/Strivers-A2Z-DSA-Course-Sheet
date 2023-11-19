public class NTriangles {
    public static void nTriangle(int n) {
        // Write your code here
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

/*

Output for n=5 will be:
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 

*/
