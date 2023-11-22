/* CODING NINJAS PLATFORM */
import java.util.*;
public class Solution {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int copy = num;
		int rev=0;
		while (copy>0) {
			int digit = copy%10;
			rev = (rev*10) + digit;
			copy /= 10;
		}
		if (rev==num) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}

/* LEETCODE PLATFORM */
class Solution {
    public boolean isPalindrome(int x) {
        int copy = x;
		int rev=0;
		while (copy>0) {
			int digit = copy%10;
			rev = (rev*10) + digit;
			copy /= 10;
		}
		if (rev == x) {
			return true;
		}
		else {
			return false;
		}
    }
}
