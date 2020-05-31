package gtci.slidingwindow;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static gtci.slidingwindow.StringPermutation.*;

public class StringPermutationTest {
    @Test
    public void example1() {
        String str = "oidbcaf";
        String pattern = "abc";
        boolean output = findPermutation(str, pattern);

        assertEquals(output, true);
    }

    @Test
    public void example2() {
        String str = "odicf";
        String pattern = "dc";
        boolean output = findPermutation(str, pattern);

        assertEquals(output, false);
    }

    @Test
    public void example3() {
        String str = "bcdxabcdy";
        String pattern = "bcdyabcdx";
        boolean output = findPermutation(str, pattern);

        assertEquals(output, true);
    }

    @Test
    public void example4() {
        String str = "aaacb";
        String pattern = "abc";
        boolean output = findPermutation(str, pattern);

        assertEquals(output, true);
    }
}
