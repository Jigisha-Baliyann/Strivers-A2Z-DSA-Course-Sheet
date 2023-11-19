import java.util.*;
public class WhileLoops {	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int even=0, odd=0;
		while(n>0){
			int digit = n%10;
			if (digit%2==0) {
				even += digit;
			}
			else {
				odd += digit;
			}
			n /= 10;
		}
		System.out.println(even+" "+odd);
	}
}
