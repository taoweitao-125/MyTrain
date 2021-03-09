package 剑指offer;

import java.util.Stack;

/**
 * @author xiaogege
 * @描述：
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 * 示例:
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 *
 * @date 2021/3/9
 * @time 10:33
 */


public class 翻转一个链表 {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        Stack<Integer> stack = new Stack<>();
        ListNode cur = head;
        while (cur != null) {
            stack.push(cur.val);
            cur = cur.next;
        }
        ListNode ans = new ListNode(stack.pop());
            ListNode cur1 = ans;
        while (!stack.isEmpty()) {
            ListNode node = new ListNode(stack.pop());
            cur1.next = node;
            cur1 = cur1.next;
        }
        cur1.next = null;
        return ans;
    }

}
