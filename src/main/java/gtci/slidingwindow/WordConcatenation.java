package gtci.slidingwindow;

import java.util.*;

/**
 * Given a string and a list of words, find all the starting indices of substrings in the given
 * string that are a concatenation of all the given words exactly once without any overlapping of
 * words. It is given that all words are of the same length.
 */
public class WordConcatenation {
    public static List<Integer> findWordConcatenation(String str, String[] words) {
        final List<Integer> ans = new ArrayList<Integer>();
        final Map<String, Integer> src = new HashMap<>();
        final int n = str.length(), m = words.length, l = words[0].length();

        for (final String word : words) src.put(word, src.getOrDefault(word, 0) + 1);

        // Start from index 0 until the index where all words, if present, would fit inside the
        // string.
        for (int i = 0; i <= n - (m * l); i++) {
            final Map<String, Integer> frq = new HashMap<>();

            // Loop words count times, in an ideal scenario.
            for (int j = 0; j < m; j++) {
                final int start = i + (j * l);
                final int end = start + l;
                String sub = str.substring(start, end);
                if (!src.containsKey(sub)) break;
                frq.put(sub, frq.getOrDefault(sub, 0) + 1);
                if (frq.get(sub) > src.get(sub)) break;
                if (j + 1 == m) ans.add(i);
            }
        }

        return ans;
      }
}
