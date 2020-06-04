package gtci.twopointers;

/**
 * Given an array of sorted numbers, remove all duplicates from it. You should not use any extra
 * space; after removing the duplicates in-place return the new length of the array.
 */
public class RemoveDuplicates {
    public static int remove(int[] arr) {
        int non = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[non - 1] != arr[i]) {
                // System.out.println(arr[non - 1] + " != " + arr[i] + " so " + arr[non] + "(" + non + ")" + " = " + arr[i] + "(" + i + ")");
                arr[non++] = arr[i];
            }
        }

        return non;
    }
}
