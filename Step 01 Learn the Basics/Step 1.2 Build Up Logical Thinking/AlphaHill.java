public class AlphaHill {
    public static void alphaHill(int n) {
        // Write your code here
        for (int i=0; i<n; i++) {
            for (int j=0; j<n-i-1; j++) {
                System.out.print("  ");
            }
            char ch = 'A';
            int breakPoint = (2*i + 1)/2;
            for (int j=1; j <= (2*i +1); j++){
                System.out.print(ch+" ");
                if (j <= breakPoint) {
                    ch++;
                }
                else {
                    ch--;
                }
            }
            for (int j=0; j<n-i-1; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}

/*

Output for n=5 will be:
        A
      A B A
    A B C B A
  A B C D C B A
A B C D E D C B A

*/
