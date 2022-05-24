package gtci.twopointers;

/**
 * Given an array of sorted numbers, remove all duplicates from it. You should not use any extra
 * space; after removing the duplicates in-place return the length of the subarray that has no
 * duplicate in it.
 */
public class RemoveDuplicatesYr2020Att2 {
    public static int remove(int[] arr) {
        int left = 1;

        for (int right = 1; right < arr.length; right++) {
            if (arr[left - 1] != arr[right]) arr[left++] = arr[right];
        }

        return left;
    }
}
