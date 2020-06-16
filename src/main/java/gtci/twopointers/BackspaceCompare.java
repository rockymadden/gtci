package gtci.twopointers;

/**
 * Given two strings containing backspaces (identified by the character '#'), check if the two
 * strings are equal.
 */
public class BackspaceCompare {
    public static boolean compare(String str1, String str2) {
        char[] s1 = str1.toCharArray(), s2 = str2.toCharArray();
        int n = s1.length, m = s2.length;

        for (int i = n - 1, j = m - 1; i >= 0 || j >= 0;) {
            char c1 = '\0', c2 = '\0';
            int b1 = 0, b2 = 0;

            while (i >= 0) {
                c1 = s1[i--];

                if (c1 == '#') b1++;
                else if (b1 > 0) b1--;
                else break;
            }

            while (j >= 0) {
                c2 = s2[j--];

                if (c2 == '#') b2++;
                else if (b2 > 0) b2--;
                else break;
            }

            if (c1 != '\0' && c2 != '\0' && c1 != c2) return false;
        }

        return true;
    }

    /**
     * To compare the given strings, first, we need to apply the backspaces. An efficient way to do
     * this would be from the end of both the strings. We can have separate pointers, pointing to
     * the last element of the given strings. We can start comparing the characters pointed out by
     * both the pointers to see if the strings are equal. If, at any stage, the character pointed
     * out by any of the pointers is a backspace ('#'), we will skip and apply the backspace until
     * we have a valid character available for comparison.
     */
    public static boolean compareRef(String str1, String str2) {
        // use two pointer approach to compare the strings
        int index1 = str1.length() - 1, index2 = str2.length() - 1;
        while (index1 >= 0 || index2 >= 0) {
            int i1 = getNextValidCharIndex(str1, index1);
            int i2 = getNextValidCharIndex(str2, index2);

            if (i1 < 0 && i2 < 0) // reached the end of both the strings
                return true;

            if (i1 < 0 || i2 < 0) // reached the end of one of the strings
                return false;

            if (str1.charAt(i1) != str2.charAt(i2)) // check if the characters are equal
                return false;

            index1 = i1 - 1;
            index2 = i2 - 1;
        }

        return true;
    }

    private static int getNextValidCharIndex(String str, int index) {
        int backspaceCount = 0;
        while (index >= 0) {
            if (str.charAt(index) == '#') // found a backspace character
                backspaceCount++;
            else if (backspaceCount > 0) // a non-backspace character
                backspaceCount--;
            else
                break;

            index--; // skip a backspace or a valid character
        }

        return index;
    }
}
