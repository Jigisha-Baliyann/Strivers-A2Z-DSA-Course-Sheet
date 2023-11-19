void nLetterTriangle(int n) {
    // Write your code here.
    for (int i=n; i>0; i--) {
            char ch = 'A';
            for (int j=0; j<=i; j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
}

/*

Output for n=5 will be:
A B C D E 
A B C D 
A B C 
A B 
A 

*/
