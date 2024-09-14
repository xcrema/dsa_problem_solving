import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String s = "abcd";
        List<String> wordDict = Arrays.asList("a","abc","b","cd");

        Map<String, String> wordMap = wordDict.stream().collect(Collectors.toMap(data -> data, Function.identity()));

        System.out.println(helper(s, 0, wordMap, new HashMap<>()));
    }

    public static boolean helper(String s, int pos, Map<String, String> wordMap, Map<String, Boolean> prevFailures) {
        if (pos >= s.length()) {
            return true;
        }

        boolean currResult = false;

        for (int tempPos = pos+1; tempPos <= s.length(); tempPos++) {
            String subStr = s.substring(pos, tempPos);

            if (!wordMap.containsKey(subStr)) continue;

            if (prevFailures.containsKey(subStr)) continue;

            currResult = helper(s, tempPos, wordMap, prevFailures);

            if (currResult) break;
        }
        if (!currResult) prevFailures.put(s.substring(pos), true);
        return currResult;
    }


//    public static boolean helper(String s, int i, Map<String, String> wordMap, Map<String, Boolean> dp) {
//
//        if (i>=s.length()) return true;
//
//        if (dp.containsKey(s.substring(i))) {
//            return dp.get(s.substring(i));
//        }
//
//        for (int j = i+1; j<=s.length(); j++) {
//            String tempStr = s.substring(i, j);
//            if (wordMap.containsKey(tempStr)) {
//                if (helper(s, j, wordMap, dp)) {
//                    dp.put(s.substring(i), true);
//                    return true;
//                }
//            }
//        }
//
//        dp.put(s.substring(i), false);
//        return false;
//    }
}