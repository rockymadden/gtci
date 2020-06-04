package gtci.slidingwindow;

import static org.junit.Assert.*;
import org.junit.Test;
import static gtci.slidingwindow.LongestSubstringKDistinct.*;

public class LongestSubstringKDistinctTest {
    @Test
    public void example1() {
        String str = "araaci";
        int k = 2;
        int actual = findLength(str, k);

        assertEquals(4, actual);
    }

    @Test
    public void example2() {
        String str = "araaci";
        int k = 1;
        int actual = findLength(str, k);

        assertEquals(2, actual);
    }

    @Test
    public void example3() {
        String str = "cbbebi";
        int k = 3;
        int actual = findLength(str, k);

        assertEquals(5, actual);
    }
}
