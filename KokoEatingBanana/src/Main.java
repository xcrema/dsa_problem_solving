public class Main {
    public static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        int h = 6;

        int r = -1;

        for (int i=0; i<piles.length; i++) {
            r = Math.max(r, piles[i]);
        }

        int l = 1;
        int result = Integer.MAX_VALUE;

        while(true) {

            int mid = (int)Math.ceil((double) (l+r)/2);
            int k = 0;

            for (int i=0; i<piles.length; i++) {
                k += Math.ceil((double)piles[i]/mid);
            }

            if (k > h) {
                l = mid+1;
            }
            if (k <= h) {
                r = mid-1;
                result = Math.min(result, mid);
            }

            if (l > r) {
                break;
            }
        }

        System.out.println(result);

    }
}