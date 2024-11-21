import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(findKthNumber(200, 5));
    }

    private static int findKthNumber(int n, int k) {

        int curr = 1;
        k = k - 1;

        while (k > 0) {

            int steps = calSteps(n, curr, curr + 1);

            if (steps <= k) {
                curr += 1;
                k -= steps;
            } else {
                curr *= 10;
                k--;
            }
        }

        return curr;
    }

    private static int calSteps(int n, int n1, int n2) {

        int steps = 0;
        while (n1 <= n) {
            steps += Math.min(n + 1, n2) - n1;
            n1 *= 10;
            n2 *= 10;
        }
        return steps;
    }

//time limit exceed exception
//    public static int findKthNumber(int n, Integer k) {
//        List<Integer> temp = new ArrayList<>(){{
//            add(k);
//        }};
//        for (int i=1; i<=9; i++) {
//            preOrder(i, n, temp);
//            if (temp.size()==2) {
//                break;
//            }
//        }
//        return temp.get(1);
//    }
//
//    public static void preOrder(int i, int n, List<Integer> temp) {
////        System.out.println(i);
//        if (temp.size()==2) {
//            return;
//        }
//        int k = temp.get(0);
//        temp.remove(0);
//        temp.add(k-1);
//        if (temp.get(0)==0) {
//            temp.add(i);
//            return;
//        }
//        for (int j=0; j<=9; j++) {
//            int num = i*10+j;
//            if (temp.size()==2) {
//                return;
//            }
//            if (num <= n) {
//                preOrder(num, n, temp);
//            }
//        }
//    }


}