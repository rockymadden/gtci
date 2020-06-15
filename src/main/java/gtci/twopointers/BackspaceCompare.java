package gtci.twopointers;

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

            if (c1 == '\0' || c2 == '\0' || c1 != c2) return false;
        }

        return true;
    }
}
