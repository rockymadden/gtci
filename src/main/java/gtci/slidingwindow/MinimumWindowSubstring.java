package gtci.slidingwindow;

/**
 * Given a string and a pattern, find the smallest substring in the given string which has all the
 * characters of the given pattern.
 */
public class MinimumWindowSubstring {
    private static boolean hasAll(int[] src, int[] frq) {
        for (int i = 0; i < 26; i++) {
            if (src[i] > 0 && frq[i] < src[i]) return false;
        }

        return true;
    }

    public static String findSubstring(String str, String pattern) {
        int[] src = new int[26], frq = new int[26];
        int n = str.length();
        String min = null;
        StringBuilder sb = new StringBuilder();

        for (char letter : pattern.toCharArray()) src[letter - 'a']++;

        for (int end = 0, start = 0; end < n; end++) {
            char endChar = str.charAt(end);
            sb.append(endChar);
            frq[endChar - 'a']++;

            while (hasAll(src, frq)) {
                if (min == null || sb.length() < min.length()) min = sb.toString();
                char startChar = str.charAt(start);
                sb.deleteCharAt(0);
                frq[startChar - 'a']--;
                start++;
            }
        }

        return min == null ? "" : min;
    }
}
