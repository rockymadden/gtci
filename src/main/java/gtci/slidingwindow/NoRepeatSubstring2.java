package gtci.slidingwindow;

/**
 * Given a string, find the length of the longest substring, which has no repeating characters.
 */
public class NoRepeatSubstring2 {
    public static int findLength(String str) {
        char[] chrs = str.toCharArray();
        int[] freq = new int[26];
        int ans = 0;

        for (int end = 0, start = 0, dist = 0, cnt = 0; end < chrs.length; end++) {
            char endChr = chrs[end];

            if (freq[endChr - 'a'] == 0) dist++;
            else if (freq[endChr - 'a'] == 1) dist--;
            cnt++;
            freq[endChr - 'a']++;

            while (dist < cnt) {
                char startChr = chrs[start++];
                if (freq[startChr - 'a'] == 2) dist++;
                else if (freq[startChr - 'a'] == 1) dist--;
                cnt--;
                freq[startChr - 'a']--;
            }

            ans = Math.max(ans, dist);
        }

        return ans;
    }
}
