package gtci.twopointers;

public class DutchFlag2 {
    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void sort(int[] arr) {
        int lo = 0, hi = arr.length - 1;

        for (int i = 0; i <= hi;) {
            if (arr[i] == 2) {
                swap(arr, i, hi--);
            } else  if (arr[i] == 0) {
                swap(arr, i++, lo++);
            } else {
                i++;
            }
        }
    }
}
