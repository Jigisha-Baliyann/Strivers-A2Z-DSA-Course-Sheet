public class AlphaRamp {
    public static void alphaRamp(int n) {
        // Write your code here
        char ch='A';
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print(ch+" ");
            }
            ch++;
            System.out.println();
        }
    }
}

/*

Output for n=5 will be:
A 
B B 
C C C 
D D D D 
E E E E E 

*/
