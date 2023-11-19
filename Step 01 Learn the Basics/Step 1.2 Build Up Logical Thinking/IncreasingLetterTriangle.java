public class IncreasingLetterTriangle {
    public static void nLetterTriangle(int n) {
        // Write your code here
        for (int i=0; i<n; i++) {
            char ch = 'A';
            for (int j=0; j<=i; j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}

/*

Output for n=5 will be:
A 
A B 
A B C 
A B C D 
A B C D E 

*/
