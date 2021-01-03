package gtci.slidingwindow;

import java.util.*;
import static org.junit.Assert.*;
import org.junit.Test;
import static gtci.slidingwindow.WordConcatenation2.*;

public class WordConcatenation2Test {
    @Test
    public void example1() {
        String str = "catfoxcat";
        String[] words = new String[] {"cat", "fox"};
        List<Integer> actual = findWordConcatenation(str, words);

        assertEquals(Arrays.asList(0 , 3), actual);
    }

    @Test
    public void example2() {
        String str = "catcatfoxfox";
        String[] words = new String[] {"cat", "fox"};
        List<Integer> actual = findWordConcatenation(str, words);

        assertEquals(Arrays.asList(3), actual);
    }
}
