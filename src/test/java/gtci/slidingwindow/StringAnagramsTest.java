package gtci.slidingwindow;

import java.util.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static gtci.slidingwindow.StringAnagrams.*;

public class StringAnagramsTest {
    @Test
    public void example1() {
        String str = "ppqp";
        String pattern = "pq";
        List<Integer> output = findStringAnagrams(str, pattern);

        assertEquals(output, new ArrayList<Integer>(Arrays.asList(1, 2)));
    }

    @Test
    public void example2() {
        String str = "abbcabc";
        String pattern = "abc";
        List<Integer> output = findStringAnagrams(str, pattern);

        assertEquals(output, new ArrayList<Integer>(Arrays.asList(2, 3, 4)));
    }
}
