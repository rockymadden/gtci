package gtci.slidingwindow;

import static org.junit.Assert.*;
import org.junit.Test;
import static gtci.slidingwindow.NoRepeatSubstring.*;

public class NoRepeatSubstringTest {
    @Test
    public void example1() {
        String str = "aabccbb";
        int actual = findLength(str);

        assertEquals(3, actual);
    }

    @Test
    public void example2() {
        String str = "abbbb";
        int actual = findLength(str);

        assertEquals(2, actual);
    }

    @Test
    public void example3() {
        String str = "abccde";
        int actual = findLength(str);

        assertEquals(3, actual);
    }
}
