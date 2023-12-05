import java.util.*;
public class ArmstrongNumbers {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int copy1 = n, copy2 = n, size=0, sum=0;
		while (copy1>0) {
			copy1 /= 10;
			size++;
		}
		while (copy2>0) {
			int digit = copy2%10;
			sum += Math.pow(digit,size);
			copy2 /= 10;
		}
		if (n==sum) System.out.println(true);
		else System.out.println(false);
	}
}

/*

I/P -> 1634
O/P -> true

I/P -> 1
O/P -> true

I/P -> 103
O/P -> false

*/
