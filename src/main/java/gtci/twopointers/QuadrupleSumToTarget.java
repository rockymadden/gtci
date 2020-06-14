package gtci.twopointers;

import java.util.*;

/**
 * Given an array of unsorted numbers and a target number, find all unique quadruplets in it, whose
 * sum is equal to the target number.
 */
public class QuadrupleSumToTarget {
    public static List<List<Integer>> searchQuadruplets(int[] arr, int target) {
        List<List<Integer>> quadruplets = new ArrayList<>();

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 3; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            for (int j = i + 1; j < arr.length - 2; j++) {
                if (j > 0 && arr[j] == arr[j - 1]) continue;

                int left = j + 1;
                int right = arr.length - 1;

                while (left < right) {
                    int sum = arr[i] + arr[j] + arr[left] + arr[right];

                    if (sum == target) {
                        quadruplets.add(Arrays.asList(arr[i], arr[j], arr[left], arr[right]));
                        left++;
                        while (left < right && arr[left] == arr[left - 1]) left++;
                        right--;
                        while (left < right && arr[right] == arr[right + 1]) right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return quadruplets;
    }
}
