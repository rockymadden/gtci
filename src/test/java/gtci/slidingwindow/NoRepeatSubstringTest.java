package gtci.slidingwindow;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static gtci.slidingwindow.NoRepeatSubstring.*;

public class NoRepeatSubstringTest {
    @Test
    public void example1() {
        String str = "aabccbb";
        int output = findLength(str);

        assertEquals(output, 3);
    }

    @Test
    public void example2() {
        String str = "abbbb";
        int output = findLength(str);

        assertEquals(output, 2);
    }

    @Test
    public void example3() {
        String str = "abccde";
        int output = findLength(str);

        assertEquals(output, 3);
    }
}
