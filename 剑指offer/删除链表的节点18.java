package 剑指offer;

/**
 * @author xiaogege
 * @描述：
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 * 返回删除后的链表的头节点。
 * @date 2021/3/9
 * @time 13:59
 */
public class 删除链表的节点18 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        if (head.val == val) {
            return head.next;
        }
       ListNode cur = head.next;
        ListNode prev = head;
       while (cur != null) {
           if (cur.val == val) {
               prev.next = cur.next;
               break;
           }
           cur = cur.next;
           prev = prev.next;
       }
       return head;
    }
}
