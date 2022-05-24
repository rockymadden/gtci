package gtci.twopointers;

/**
 * Given an array of sorted numbers, separate all duplicates from it in-place. You should not use
 * any extra space; move all duplicates at the end of the array and after moving return the length
 * of the subarray that has no duplicate in it.
 */
public class RemoveDuplicatesYr2022 {
    public static int remove(int[] arr) {
        int non = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[non] != arr[i]) arr[++non] = arr[i];
        }

        return non + 1;
    }
}
