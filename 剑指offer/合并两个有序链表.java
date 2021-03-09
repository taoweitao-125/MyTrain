package 剑指offer;

import java.util.*;

import static java.util.Collections.*;

/**
 * @author xiaogege
 * @描述：
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * @date 2021/3/9
 * @time 13:03
 */
public class 合并两个有序链表 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ArrayList<Integer> list1 = new ArrayList<>();
        while ( cur1 != null) {
            list1.add(cur1.val);
            cur1 = cur1.next;
        }
        while (cur2 != null) {
            list1.add(cur2.val);
            cur2 = cur2.next;
        }
        Collections.sort(list1);
        ListNode ans = new ListNode(-1);
        ListNode cur = ans;
        for (int object : list1) {
            ListNode node = new ListNode(object);
            cur.next = node;
            cur = cur.next;
        }
        return ans.next;

    }
}
