package gtci.twopointers;

import static org.junit.Assert.*;
import org.junit.Test;
import static gtci.twopointers.BackspaceCompare.*;

public class BackspaceCompareTest {
    @Test
    public void example1() {
        String str1 = "xy#z";
        String str2 = "xzz#";
        boolean actual = compare(str1, str2);

        assertEquals(true, actual);
    }

    @Test
    public void example2() {
        String str1 = "xy#z";
        String str2 = "xyz#";
        boolean actual = compare(str1, str2);

        assertEquals(false, actual);
    }

    @Test
    public void example3() {
        String str1 = "xp#";
        String str2 = "xyz##";
        boolean actual = compare(str1, str2);

        assertEquals(true, actual);
    }

    @Test
    public void example4() {
        String str1 = "xywrrmp";
        String str2 = "xywrrmu#p";
        boolean actual = compare(str1, str2);

        assertEquals(true, actual);
    }
}
