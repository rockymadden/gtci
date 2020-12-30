package gtci.slidingwindow;

import static org.junit.Assert.*;
import org.junit.Test;
import static gtci.slidingwindow.StringPermutation2.*;

public class StringPermutation2Test {
    @Test
    public void example1() {
        String str = "oidbcaf";
        String pattern = "abc";
        boolean actual = findPermutation(str, pattern);

        assertEquals(true, actual);
    }

    @Test
    public void example2() {
        String str = "odicf";
        String pattern = "dc";
        boolean actual = findPermutation(str, pattern);

        assertEquals(false, actual);
    }

    @Test
    public void example3() {
        String str = "bcdxabcdy";
        String pattern = "bcdyabcdx";
        boolean actual = findPermutation(str, pattern);

        assertEquals(true, actual);
    }

    @Test
    public void example4() {
        String str = "aaacb";
        String pattern = "abc";
        boolean actual = findPermutation(str, pattern);

        assertEquals(true, actual);
    }
}
