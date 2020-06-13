package gtci.twopointers;

/**
 * Given an array containing 0s, 1s and 2s, sort the array in-place. You should treat numbers of
 * the array as objects, hence, we can’t count 0s, 1s, and 2s to recreate the array.
 *
 * The flag of the Netherlands consists of three colors: red, white and blue; and since our input
 * array also consists of three different numbers that is why it is called Dutch National Flag
 * problem.
 */
public class DutchFlag {
    private static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static void sort(int[] arr) {
        int lo = 0, hi = arr.length - 1;

        for (int i = 0; i <= hi;) {
            if (arr[i] == 0) {
                swap(arr, i, lo);
                lo++;
                i++;
            } else if (arr[i] == 1) {
                i++;
            } else {
                swap(arr, i, hi);
                hi--;
            }
        }
    }
}
