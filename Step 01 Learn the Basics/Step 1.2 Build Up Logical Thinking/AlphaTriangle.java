public class Solution {
    public static void alphaTriangle(int n) {
        // Write your code here
        char ch = 'A';
        ch += (n-1);
        for (int i=0; i<n; i++) {
            char character = ch;
            for (int j=0; j<=i; j++) {
                System.out.print(character+" ");
                character--;
            }
            System.out.println();
        }
    }
}

/*

Output for n=5 will be:
E 
E D 
E D C 
E D C B 
E D C B A 

*/
