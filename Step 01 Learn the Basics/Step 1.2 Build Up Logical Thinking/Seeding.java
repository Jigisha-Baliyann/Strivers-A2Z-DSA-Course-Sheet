public class Seeding {
    public static void seeding(int n) {
        // Write your code here
        for (int i=n; i>0; i--) {
            for (int j=i; j>0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*

Output for n=5 will be:
* * * * * 
* * * * 
* * * 
* * 
* 

*/
