public class CountDigits {
    public static int countDigits(int n){
        // Write your code here.
        int count=0, copy=n;
        while (copy>0) {
            int digit = copy%10;
            if (digit!=0 && n%digit==0) {
                count++;
            }
            copy /= 10;
        }
        return count;
    }
}

/*

I/P -> 336
O/P -> 3

I/P -> 35
O/P -> 1

I/P -> 373
O/P -> 0

*/
