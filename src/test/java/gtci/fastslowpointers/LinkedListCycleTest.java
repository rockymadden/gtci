package gtci.fastslowpointers;

import static org.junit.Assert.*;
import org.junit.Test;
import static gtci.fastslowpointers.LinkedListCycle.*;

public class LinkedListCycleTest {
    @Test
    public void example1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        boolean actual = hasCycle(head);

        assertEquals(false, actual);
    }

    @Test
    public void example2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = head.next.next;
        boolean actual = hasCycle(head);

        assertEquals(true, actual);
    }
}
