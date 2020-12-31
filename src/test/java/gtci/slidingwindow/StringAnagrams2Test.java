package gtci.slidingwindow;

import java.util.*;
import static org.junit.Assert.*;
import org.junit.Test;
import static gtci.slidingwindow.StringAnagrams2.*;

public class StringAnagrams2Test {
    @Test
    public void example1() {
        String str = "ppqp";
        String pattern = "pq";
        List<Integer> actual = findStringAnagrams(str, pattern);

        assertEquals(Arrays.asList(1, 2), actual);
    }

    @Test
    public void example2() {
        String str = "abbcabc";
        String pattern = "abc";
        List<Integer> actual = findStringAnagrams(str, pattern);

        assertEquals(Arrays.asList(2, 3, 4), actual);
    }
}
