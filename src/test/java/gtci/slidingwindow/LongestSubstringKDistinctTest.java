package gtci.slidingwindow;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static gtci.slidingwindow.LongestSubstringKDistinct.*;

public class LongestSubstringKDistinctTest {
    @Test
    public void example1() {
        String str = "araaci";
        int k = 2;
        int output = findLength(str, k);

        assertEquals(output, 4);
    }

    @Test
    public void example2() {
        String str = "araaci";
        int k = 1;
        int output = findLength(str, k);

        assertEquals(output, 2);
    }

    @Test
    public void example3() {
        String str = "cbbebi";
        int k = 3;
        int output = findLength(str, k);

        assertEquals(output, 5);
    }
}
