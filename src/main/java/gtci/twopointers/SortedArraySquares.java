package gtci.twopointers;

/**
 * Given a sorted array, create a new array containing squares of all the number of the input array
 * in the sorted order.
*/
public class SortedArraySquares {
    public static int[] makeSquares(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1, i = n - 1;
        int[] squares = new int[n];

        while (left <= right) {
            int leftSq = arr[left] * arr[left];
            int rightSq = arr[right] * arr[right];

            if (leftSq > rightSq) {
                squares[i--] = leftSq;
                left++;
            } else {
                squares[i--] = rightSq;
                right--;
            }
        }

        return squares;
    }
}
