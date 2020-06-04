package gtci.slidingwindow;

import static org.junit.Assert.*;
import org.junit.Test;
import static gtci.slidingwindow.MinimumWindowSubstring.*;

public class MinimumWindowSubstringTest {
    @Test
    public void example1() {
        String str = "aabdec";
        String pattern = "abc";
        String actual = findSubstring(str, pattern);

        assertEquals("abdec", actual);
    }

    @Test
    public void example2() {
        String str = "abdabca";
        String pattern = "abc";
        String actual = findSubstring(str, pattern);

        assertEquals("abc", actual);
    }

    @Test
    public void example3() {
        String str = "adcad";
        String pattern = "abc";
        String actual = findSubstring(str, pattern);

        assertEquals("", actual);
    }
}
