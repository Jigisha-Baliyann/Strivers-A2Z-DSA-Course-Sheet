public class NinjaAndTheNumberPattern {
    public static void getNumberPattern(int n) {
        // Write your code here.
        for (int i=0; i<(2*n -1); i++) {
            for (int j=0; j<(2*n -1); j++) {
                int top = i;
                int left = j;
                int right = 2*n - 2 - j;
                int bottom = 2*n - 2 - i;
                int num = Math.min(Math.min(top,bottom),Math.min(left,right));
                System.out.print(n-num);
            }
            System.out.println();
        }
    }
}

/*

Output for n=5 will be:
555555555
544444445
543333345
543222345
543212345
543222345
543333345
544444445
555555555

*/
