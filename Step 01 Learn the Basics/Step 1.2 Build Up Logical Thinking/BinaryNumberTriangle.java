void nBinaryTriangle(int n) {
    // Write your code here.
    for (int i=0; i<n; i++) {
        for (int j=0; j<i; j++) {
            if (i+j%2==0) System.out.print(1+" ");
            else System.out.print(0+" ");
        }
        System.out.println();
    }
}

/*

Output for n=5 will be:
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 

*/
