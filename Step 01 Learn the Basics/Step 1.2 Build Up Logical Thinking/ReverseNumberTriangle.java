public class ReverseNumberTriangle {
    public static void nNumberTriangle(int n) {
        // Write your code here
        for (int i=n; i>0; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

/*

Output for n=5 will be:
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 

*/
