public class GCDorHCF {
    public static int calcGCD(int n, int m){
        // Write your code here.
        if (n>m) return gcd(n,m);
        else return gcd(m,n);
    }
    public static int gcd(int n, int m){
        for (int i=m; i>=1; i--) {
            if (n%i==0 && m%i==0) return i;
        }
        return 1;
    }
}

/*

I/P -> 6 4
O/P -> 2

I/P -> 9 6
O/P -> 3

I/P -> 2 5
O/P -> 1

*/
