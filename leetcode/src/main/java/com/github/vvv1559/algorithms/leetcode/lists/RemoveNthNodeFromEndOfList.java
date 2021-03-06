package com.github.vvv1559.algorithms.leetcode.lists;

/*
 * Original text: https://leetcode.com/problems/remove-nth-node-from-end-of-list/#/description
 *
 * Given a linked list, remove the nth node from the end of list and return its head.
 *
 * For example,
 *
 * Given linked list: 1->2->3->4->5, and n = 2.
 *
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 *
 * Note:
 * Given n will always be valid.
 * Try to do this in one pass.
 *
 * */

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;
import com.github.vvv1559.algorithms.structures.ListNode;

@Difficulty(Level.MEDIUM)
class RemoveNthNodeFromEndOfList {

    ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode resultHead = new ListNode(-1);
        resultHead.next = head;

        ListNode windowStart = resultHead, windowEnd = resultHead;

        while (n-- > 0) {
            windowEnd = windowEnd.next;
        }

        while ((windowEnd = windowEnd.next) != null) {
            windowStart = windowStart.next;

        }

        windowStart.next = windowStart.next.next;

        return resultHead.next;
    }
}
