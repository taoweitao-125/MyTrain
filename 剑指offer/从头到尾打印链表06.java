package 剑指offer;
import java.util.Stack;

/**
 * @author xiaogege
 * @描述：输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 *  输入：head = [1,3,2]
 *  输出：[2,3,1]
 *
 * @date 2021/3/9
 * @time 9:54
 */


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class 从头到尾打印链表06 {
    public int[] reversePrint(ListNode head) {
        ListNode cur = head;
        Stack<ListNode> stack = new Stack<>();
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        int[] array = new int[stack.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop().val;
        }
        return array;
    }
}
