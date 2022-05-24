package gtci.twopointers;

public class PairWithTargetSumYr2022 {
    public static int[] search(int[] arr, int targetSum) {
        for (int left = 0, right = arr.length - 1; left < right;) {
            final int sum = arr[left] + arr[right];

            if (sum > targetSum) right--;
            else if (sum < targetSum) left--;
            else return new int[] { left, right };
        }

        return new int[] { -1, -1 };
    }
}
