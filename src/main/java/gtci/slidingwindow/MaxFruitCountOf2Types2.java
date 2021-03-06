package gtci.slidingwindow;

import java.util.*;

/**
 * Given an array of characters where each character represents a fruit tree,
 * you are given two baskets, and your goal is to put maximum number of fruits
 * in each basket. The only restriction is that each basket can have only one
 * type of fruit.
 *
 * You can start with any tree, but you can’t skip a tree once you have started.
 * You will pick one fruit from each tree until you cannot, i.e., you will stop
 * when you have to pick from a third fruit type.
 *
 * Write a function to return the maximum number of fruits in both the baskets.
 */
public class MaxFruitCountOf2Types2 {
    public static int findLength(char[] arr) {
        final Map<Character, Integer> baskets = new HashMap<>();
        int max = 0;

        for (int end = 0, start = 0, cnt = 0; end < arr.length; end++) {
            final char endFruit = arr[end];
            baskets.put(endFruit, baskets.getOrDefault(endFruit, 0) + 1);
            cnt++;

            while (baskets.size() > 2) {
                final char startFruit = arr[start];
                baskets.put(startFruit, baskets.get(startFruit) - 1);
                if (baskets.get(startFruit) == 0) baskets.remove(startFruit);
                start++;
                cnt--;
            }

            max = Math.max(max, cnt);
        }

        return max;
    }
}
