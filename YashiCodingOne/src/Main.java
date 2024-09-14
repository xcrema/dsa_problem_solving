import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] input3 = {1,2,1,2,1,2,2,2,2,1};
        System.out.println(modifiedString("abcdsadsdadasdasddfawdq", 10, input3));
    }

    public static String modifiedString(String input1, int input2, int[] input3) {

        String[] arr = input1.split("");

        for (int i = 0; i < input2; i++) {
            if (input3[i] == 1) {
                String temp = arr[0];
                arr[0] = arr[arr.length - 1];
                arr[arr.length - 1] = temp;
                continue;
            }
            if (input3[i] == 2) {
                int secondHalfIdx = arr.length % 2 == 0 ? arr.length / 2 : arr.length / 2 + 1;
                int startIdx = 0;
                while (secondHalfIdx < arr.length) {
                    String temp = arr[startIdx];
                    arr[startIdx] = arr[secondHalfIdx];
                    arr[secondHalfIdx] = temp;
                    secondHalfIdx++;
                    startIdx++;
                }
            }
        }
        return String.join("", arr);
    }






//    public static void main(String[] args) {
//
//        String[] input3 = {"puzzle", "thunder", "powder", "blender", "asdunder", "under"};
//        System.out.println(checkRhymes("thunder", input3, 6));
//    }
//
//    public static String checkRhymes(String input1, String[] input2, int input3) {
//        String rhymingWord = "No Word";
//        int maxMatchCount = 0;
//
//        for (int i = 0; i < input3; i++) {
//            String currentWord = input2[i];
//
//            int matchCount = 0;
//            int sIndex = input1.length() - 1;
//            int wordIndex = currentWord.length() - 1;
//
//            if (currentWord.equals(input1)) {
//                continue;
//            }
//
//            while (sIndex >= 0 && wordIndex >= 0 && input1.charAt(sIndex) == currentWord.charAt(wordIndex)) {
//                matchCount++;
//                sIndex--;
//                wordIndex--;
//            }
//
//            if (matchCount > maxMatchCount) {
//                maxMatchCount = matchCount;
//                rhymingWord = currentWord;
//            }
//        }
//
//        return rhymingWord;
//    }
}