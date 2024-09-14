import java.util.*;
import java.util.stream.Collectors;

public class Main {
//    public static void main(String[] args) {
//
//
//        int n = 4;
//        List<Integer> A = new ArrayList<>(){{add(1);add(1);add(1);add(2);}};
//        int q = 3;
//        int t = 3;
//        List<List<Integer>> queries = Arrays.asList(Arrays.asList(1,1,4), Arrays.asList(2,1,2), Arrays.asList(1,1,4));
//        System.out.println(get_ans(n, A, q, t, queries));
//    }

//    public static void main(String[] args) {
//
//
//        int n = 5;
//        List<Integer> A = new ArrayList<>(){{add(1);add(2);add(3);add(4);add(5);}};
//        int q = 2;
//        int t = 3;
//        List<List<Integer>> queries = Arrays.asList(Arrays.asList(1,1,2), Arrays.asList(1,2,5));
//        System.out.println(get_ans(n, A, q, t, queries));
//    }

    public static void main(String[] args) {


        int n = 6;
        List<Integer> A = new ArrayList<>(){{add(10);add(12);add(14);add(1);add(0);add(0);}};
        int q = 5;
        int t = 3;
        List<List<Integer>> queries = Arrays.asList(Arrays.asList(1,1,1), Arrays.asList(1,2,5), Arrays.asList(2,1,10), Arrays.asList(2,3,15), Arrays.asList(1,1,4));
        System.out.println(get_ans(n, A, q, t, queries));
    }

    public static int get_ans(int n, List<Integer> A, int q, int t, List<List<Integer>> queries) {
        int result = 0;
        for (List<Integer> query : queries) {
            switch (query.get(0)) {
                case 1:
                    result += checkForGoodArray(A, query.get(1), query.get(2));
                    break;
                case 2:
                    A.set(query.get(1)-1, query.get(2));
                    break;
            }
        }
        return result;
    }

    private static int checkForGoodArray(List<Integer> A, int l, int r) {
        if (l >= r || r>A.size() || l<=0) {
            return 0;
        }
        List<Integer> newA = A.subList(l-1, r);
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer a : newA) {
            int count = map.getOrDefault(a, 0);
            map.put(a, ++count);
        }

        int count = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (count == -1) {
                count = entry.getValue();
            } else if (entry.getValue() != count) {
                return 0;
            }
        }
        return r-l+1;
    }
}


//import java.util.*;
//
//public class Main {
//
//    public static int solve(int N, int M, List<Integer> A) {
//        Collections.sort(A, Collections.reverseOrder());
//        int[] warehouses = new int[M];
//        for (int profit : A) {
//            int minWarehouseIndex = findMinWarehouseIndex(warehouses);
//            warehouses[minWarehouseIndex] += profit;
//        }
//        return findMaxProfit(warehouses);
//    }
//
//    private static int findMinWarehouseIndex(int[] warehouses) {
//        int minIndex = 0;
//        for (int i = 1; i < warehouses.length; i++) {
//            if (warehouses[i] < warehouses[minIndex]) {
//                minIndex = i;
//            }
//        }
//        return minIndex;
//    }
//
//    private static int findMaxProfit(int[] warehouses) {
//        int maxProfit = Integer.MIN_VALUE;
//        for (int profit : warehouses) {
//            maxProfit = Math.max(maxProfit, profit);
//        }
//        return maxProfit;
//    }
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int N = Integer.parseInt(scan.nextLine().trim());
//        int M = Integer.parseInt(scan.nextLine().trim());
//        List<Integer> A = new ArrayList<>(N);
//        for (int j = 0; j < N; j++) {
//            A.add(Integer.parseInt(scan.nextLine().trim()));
//        }
//        int result = solve(N, M, A);
//        System.out.println(result);
//    }
//}