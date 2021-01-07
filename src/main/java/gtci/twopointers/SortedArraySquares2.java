package gtci.twopointers;

/**
 * Given a sorted array, create a new array containing squares of all the numbers of the input
 * array in the sorted order.
 */
public class SortedArraySquares2 {
    public static int[] makeSquares(int[] arr) {
        final int[] ans = new int[arr.length];
        int left = 0, right = arr.length - 1, i = arr.length - 1;

        while (left <= right) {
            final int lsq = arr[left] * arr[left];
            final int rsq = arr[right] * arr[right];

            if (lsq > rsq) {
                ans[i--] = lsq;
                left++;
            } else {
                ans[i--] = rsq;
                right--;
            }
        }

        return ans;
    }
}
