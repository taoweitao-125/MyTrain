package DataStructer.Conllection.List;

/**
 * @author xiaogege
 * @描述： 链表习题
 * @date 2021/3/16
 * @time 11:47
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class ListExtir {
    /*链表中环的入口
    * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
    * */
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if(pHead == null || pHead.next == null) {
            return null;
        }
        ListNode fast = pHead;
        ListNode slow = pHead;
        while(fast != null) {//判断有没有环
            //先同时走
            fast = fast.next.next;
            slow = slow.next;
            //再判断是否相同
            if(fast == slow) {
                //快指针从头开始走
                fast = pHead;
                while(fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
        //若果没有，就返回null;
        return null;
    }

    /*
    * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
    * 重复的结点不保留，返回链表头指针。
    * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
    * */

    public ListNode deleteDuplication(ListNode pHead) {
        if(pHead == null || pHead.next == null) {
            return pHead;
        }
        ListNode head = new ListNode(0);
        head.next = pHead;//傀儡节点
        ListNode prev = head;// 前驱节点从傀儡节点开始
        ListNode cur = head.next;//从第一个节点开始
        while(cur != null) {
            if(cur.next != null && cur.val == cur.next.val) {
                while(cur.next != null && cur.val == cur.next.val) {
                    //cur和cur.next的节点值相同，就一直往后走
                    cur = cur.next;
                }
//                不相同时，前驱指向cur的下一个；
//                cur指向它的下一个
                cur = cur.next;
                prev.next = cur.next;
            }else{
                //值不相同时，prev和cur同时往后走
                prev = cur;
                cur = cur.next;
            }
        }
        return head.next;
    }

    /*
    *输入一个链表，反转链表后，输出新链表的表头。
        输入  {1,2,3}
        返回值 {3,2,1}
    * */
    public ListNode ReverseList(ListNode head) {
        ListNode cur = head;//cur从头开始
        ListNode prev = null;//
        while(cur != null) {
            ListNode curNext = cur.next;//记录cur的下一个
            cur.next = prev;//将cur插在prev前
            prev = cur;//prev前移
            cur = curNext;//cur向后走一个即curNext；
        }
        return prev;
    }
}
