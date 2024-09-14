import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            char[] strArr = str.toCharArray();
            Arrays.sort(strArr);
            String newStr = new String(strArr);

            List<String> list = map.getOrDefault(newStr, new ArrayList<>());
            list.add(str);
        }

        System.out.println(map.values());

    }
}