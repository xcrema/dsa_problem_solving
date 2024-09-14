public class Main {
    public static void main(String[] args) {

        String s = "010";

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int num = Character.getNumericValue(s.charAt(i));
            if (num == 1) count++;
        }

        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (count > 1) {
                result += "1";
                count--;
                continue;
            }
            if (count == 1 && i == s.length() - 1) {
                result += "1";
                count--;
                continue;
            }
            result += "0";
        }

        System.out.println(result);
    }
}