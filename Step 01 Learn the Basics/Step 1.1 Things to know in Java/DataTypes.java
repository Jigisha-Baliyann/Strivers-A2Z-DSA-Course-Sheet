public class DataTypes {
    public static int dataTypes(String type) {
        // Write your code here
        int answer = 0;
        switch (type) {
            case "Integer": answer=4; break;
            case "Long": answer=8; break;
            case "Float": answer=4; break;
            case "Double": answer=8; break;
            case "Character": answer=1; break;
        }
        return answer;
    }
}
