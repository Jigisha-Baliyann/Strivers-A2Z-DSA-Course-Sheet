import java.util.*;
public class ForLoops {
	public static void main(String[] args) {
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n==1 || n==2) {
			System.out.println(1);
		}
		else {
			int a=0, b=1, count=2, c=0;
			while (count<=n) {
				c = a+b;
				a = b;
				b = c;
				count++;
			}
			System.out.println(c);
		}
	}
}
