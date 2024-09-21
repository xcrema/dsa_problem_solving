public class Main {
    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};

        System.out.println(canCompleteCircuit(gas, cost));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {

        int totalSurplus = 0;
        int surplus = 0;
        int n = gas.length;
        int start = 0;


        for (int i = 0; i < n; i++) {
            totalSurplus += gas[i] - cost[i];
            surplus += gas[i] - cost[i];

            if (surplus < 0) {
                surplus = 0;
                start = i+1;
            }
        }

        return totalSurplus >=0 ? start : -1;

    }
}