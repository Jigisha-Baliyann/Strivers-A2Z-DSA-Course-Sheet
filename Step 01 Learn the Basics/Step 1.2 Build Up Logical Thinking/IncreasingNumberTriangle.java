public class IncreasingNumberTriangle {
    public static void nNumberTriangle(int n) {
        // Write your code here
        int num=1;
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}

/*

Output for n=5 will be:
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

*/
