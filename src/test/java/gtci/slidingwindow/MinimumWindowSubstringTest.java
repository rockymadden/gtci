package gtci.slidingwindow;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static gtci.slidingwindow.MinimumWindowSubstring.*;

public class MinimumWindowSubstringTest {
    @Test
    public void example1() {
        String str = "aabdec";
        String pattern = "abc";
        String output = findSubstring(str, pattern);

        assertEquals(output, "abdec");
    }

    @Test
    public void example2() {
        String str = "abdabca";
        String pattern = "abc";
        String output = findSubstring(str, pattern);

        assertEquals(output, "abc");
    }

    @Test
    public void example3() {
        String str = "adcad";
        String pattern = "abc";
        String output = findSubstring(str, pattern);

        assertEquals(output, "");
    }
}
