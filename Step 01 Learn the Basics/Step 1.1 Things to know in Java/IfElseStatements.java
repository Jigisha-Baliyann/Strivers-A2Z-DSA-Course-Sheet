public class IfElseStatements {
    public static String compareIfElse(int a, int b) {
        // Write your code here
        String answer="";
        if (a>b) {
            answer = "greater";
        }
        else if (a<b) {
            answer = "smaller";
        }
        else {
            answer = "equal";
        }
        return answer;
    }
}
