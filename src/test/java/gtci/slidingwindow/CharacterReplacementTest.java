package gtci.slidingwindow;

import static org.junit.Assert.*;
import org.junit.Test;
import static gtci.slidingwindow.CharacterReplacement.*;

public class CharacterReplacementTest {
    @Test
    public void example1() {
        String str = "aabccbb";
        int k = 2;
        int actual = findLength(str, k);

        assertEquals(5, actual);
    }

    @Test
    public void example2() {
        String str = "abbcb";
        int k = 1;
        int actual = findLength(str, k);

        assertEquals(4, actual);
    }

    @Test
    public void example3() {
        String str = "abccde";
        int k = 1;
        int actual = findLength(str, k);

        assertEquals(3, actual);
    }
}
