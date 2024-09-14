public class Main {
    public static void main(String[] args) {

        String ogStr = "abc";

        helper(ogStr, 0, "");
    }

    private static void helper(String ogStr, int i, String currentStr) {


        String tempCurrentStr = currentStr + ogStr
        helper(ogStr, i+1, );

        helper(ogStr, i+1, currentStr);
    }
}