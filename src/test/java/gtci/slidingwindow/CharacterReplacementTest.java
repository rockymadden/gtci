package gtci.slidingwindow;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static gtci.slidingwindow.CharacterReplacement.*;

public class CharacterReplacementTest {
    @Test
    public void example1() {
        String str = "aabccbb";
        int k = 2;
        int output = findLength(str, k);

        assertEquals(output, 5);
    }

    @Test
    public void example2() {
        String str = "abbcb";
        int k = 1;
        int output = findLength(str, k);

        assertEquals(output, 4);
    }

    @Test
    public void example3() {
        String str = "abccde";
        int k = 1;
        int output = findLength(str, k);

        assertEquals(output, 3);
    }
}
