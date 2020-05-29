package gtci.slidingwindow;

import java.util.*;

/**
 * Given an array of characters where each character represents a fruit tree, you are given two
 * baskets and your goal is to put maximum number of fruits in each basket. The only restriction is
 * that each basket can have only one type of fruit.
 *
 * You can start with any tree, but once you have started you can’t skip a tree. You will pick one
 * fruit from each tree until you cannot, i.e., you will stop when you have to pick from a third
 * fruit type.
 *
 * Write a function to return the maximum number of fruits in both the baskets.
 */
public class MaxFruitCountOf2Types {
    public static int findLength(char[] arr) {
        Map<Character, Integer> baskets = new HashMap<>();
        int longest = 0;

        for (int end = 0, start = 0, cnt = 0; end < arr.length; end++) {
            char endFruit = arr[end];
            baskets.put(endFruit, baskets.getOrDefault(endFruit, 0) + 1);
            cnt++;

            while (baskets.size() > 2) {
                char startFruit = arr[start];
                baskets.put(startFruit, baskets.get(startFruit) - 1);
                if (baskets.get(startFruit) == 0) baskets.remove(startFruit);
                cnt--;
                start++;
            }

            longest = Math.max(longest, cnt);
        }

        return longest;
    }
}
