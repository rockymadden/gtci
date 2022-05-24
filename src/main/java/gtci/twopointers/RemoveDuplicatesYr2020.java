package gtci.twopointers;

/**
 * Given an array of sorted numbers, remove all duplicates from it. You should not use any extra
 * space; after removing the duplicates in-place return the new length of the array.
 */
public class RemoveDuplicatesYr2020 {
    public static int remove(int[] arr) {
        int non = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[non - 1] != arr[i]) arr[non++] = arr[i];
        }

        return non;
    }

    /**
     * In this problem, we need to remove the duplicates in-place such that the resultant length of
     * the array remains sorted. As the input array is sorted, therefore, one way to do this is to
     * shift the elements left whenever we encounter duplicates. In other words, we will keep one
     * pointer for iterating the array and one pointer for placing the next non-duplicate number.
     * So our algorithm will be to iterate the array and whenever we see a non-duplicate number we
     * move it next to the last non-duplicate number we've seen.
     */
    public static int removeRef(int[] arr) {
        int nextNonDuplicate = 1; // index of the next non-duplicate element
        for (int i = 1; i < arr.length; i++) {
            if (arr[nextNonDuplicate - 1] != arr[i]) {
                arr[nextNonDuplicate] = arr[i];
                nextNonDuplicate++;
            }
        }

        return nextNonDuplicate;
    }
}
