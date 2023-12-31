public class SwitchStatement {
    public static double areaSwitchCase(int ch, double []a) {
        // Write your code here
        double answer = 0;
        switch (ch) {
            case 1: double r = a[0];
                    answer = Math.PI * r * r;
                    break;
            case 2: double l = a[0], b = a[1];
                    answer = l * b;
                    break;
        }
        return Math.round(answer * 100000) / 100000.0;
    }
}
